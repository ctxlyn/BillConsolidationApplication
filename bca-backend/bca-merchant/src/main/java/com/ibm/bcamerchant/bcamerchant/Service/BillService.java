package com.ibm.bcamerchant.bcamerchant.Service;


import com.ibm.bcamerchant.bcamerchant.Domain.BillDomain;
import com.ibm.bcamerchant.bcamerchant.Repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;

    public List<BillDomain> getAllBills() {
        List<BillDomain> bills = new ArrayList<>();
        billRepository.findAll().forEach(bills::add);
        return bills;
    }

    public BillDomain addBill(BillDomain bill) {
        Integer amountDue = Integer.parseInt(bill.getAmountDue().toString());//toString then parseInt
        if(amountDue < 0){
            amountDue = 0;
            BigDecimal amount = new BigDecimal(amountDue);//converting int to BigDecimal
            bill.setAmountDue(amount);
        }
        return billRepository.save(bill);
    }

    public List<BillDomain> getByMerchantId(int merchantId){
        List<BillDomain> billsByMerch = new ArrayList<>();//new List object of Bill Domain
        billRepository.findByMerchantId(merchantId).forEach(billsByMerch::add);
        return billsByMerch;
    }


}
