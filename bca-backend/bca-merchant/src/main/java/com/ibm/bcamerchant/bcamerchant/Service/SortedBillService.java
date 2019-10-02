package com.ibm.bcamerchant.bcamerchant.Service;

import com.ibm.bcamerchant.bcamerchant.Domain.SortedBillDomain;
import com.ibm.bcamerchant.bcamerchant.Repository.SortedBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class SortedBillService {

    @Autowired
    private SortedBillRepository sortedBillRepository;

    public SortedBillDomain addSortedBill(SortedBillDomain sortedBill){
        return sortedBillRepository.save(sortedBill);
    }

    public List<SortedBillDomain> getSortedBill(String combinedMonth, String combinedYear, int merchantId){
        List<SortedBillDomain> sortedBillsByMerchant = new ArrayList<>();
        sortedBillRepository.findByCombinedMonthAndCombinedYearAndMerchantId(combinedMonth, combinedYear, merchantId).forEach(sortedBillsByMerchant::add);
        return sortedBillsByMerchant;
    }

    public List<SortedBillDomain> getByMerchantId(int merchantId){
        List<SortedBillDomain> sorted = new ArrayList<>();
        sortedBillRepository.findByMerchantId(merchantId).forEach(sorted::add);
        return sorted;
    }

    public List<SortedBillDomain> getAllSortedBills(){
        List<SortedBillDomain> sorted = new ArrayList<>();
        sortedBillRepository.findAll().forEach(sorted::add);
        return sorted;
    }

    public List<SortedBillDomain> getSortedByCombinedYear(String combinedYear){
        List<SortedBillDomain> sorted = new ArrayList<>();
        sortedBillRepository.findByCombinedYearContaining(combinedYear).forEach(sorted::add);
        return sorted;
    }

}
