package com.ibm.bcamerchant.bcamerchant.Controller;

import com.ibm.bcamerchant.bcamerchant.Domain.SortedBillDomain;
import com.ibm.bcamerchant.bcamerchant.Service.SortedBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class SortedBillController {

    @Autowired
    private SortedBillService sortedBillService;

    @RequestMapping(value = "/sortedBill/getByMerchantId/{merchantId}", method = RequestMethod.GET)
    public List<SortedBillDomain> getByMerchantId(@PathVariable int merchantId){
        return sortedBillService.getByMerchantId(merchantId);
    }

    @RequestMapping(value = "/addSortedBill", method = RequestMethod.POST)
    public SortedBillDomain addSortedBill(@RequestBody SortedBillDomain sortedBill){
        return sortedBillService.addSortedBill(sortedBill);
    }

    @RequestMapping(value = "/getSortedBill/{combinedMonth}/{combinedYear}/{merchantId}", method = RequestMethod.GET)
    public List<SortedBillDomain> getSortedBill(@PathVariable String combinedMonth, @PathVariable String combinedYear,
                                                 @PathVariable int merchantId){
        return sortedBillService.getSortedBill(combinedMonth, combinedYear, merchantId);
    }

    @RequestMapping(value = "/getAllSortedBills", method = RequestMethod.GET)
    public  List<SortedBillDomain> getAllSortedBills(){
        return sortedBillService.getAllSortedBills();
    }

    @RequestMapping(value = "/getSortedByCombinedYear/{combinedYear}", method = RequestMethod.GET)
    public List<SortedBillDomain> getSortedByCombinedYearContaining(@PathVariable String combinedYear){
        return sortedBillService.getSortedByCombinedYear(combinedYear);
    }

}
