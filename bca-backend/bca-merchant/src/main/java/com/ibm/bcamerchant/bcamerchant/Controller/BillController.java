package com.ibm.bcamerchant.bcamerchant.Controller;

import com.ibm.bcamerchant.bcamerchant.Domain.BillDomain;
import com.ibm.bcamerchant.bcamerchant.Service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class BillController {

    @Autowired
    BillService billService;

    @GetMapping(value = "/getAllBills")
    public List<BillDomain> getAllBills() {
        return billService.getAllBills();
    }

    @PostMapping(value = "/addBill")
    public BillDomain addBill(@RequestBody BillDomain bill) {
        return billService.addBill(bill);
    }

    @GetMapping(value = "/getByMerchantId/{merchantId}")
    public List<BillDomain> getByMerchantId(@PathVariable int merchantId){
        return billService.getByMerchantId(merchantId);
    }


}
