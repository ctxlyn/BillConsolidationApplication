package com.ibm.bcamerchant.bcamerchant.Controller;

import com.ibm.bcamerchant.bcamerchant.Domain.MerchantDomain;
import com.ibm.bcamerchant.bcamerchant.Service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class MerchantController {

    @Autowired
    MerchantService merchantService;

    @RequestMapping(value = "/getAllMerchants", method = RequestMethod.GET)
    public List<MerchantDomain> getAllMerchants() {
        return merchantService.getAllMerchants();
    }

    @RequestMapping(value = "/addMerchant", method = RequestMethod.POST)
    public void addMerchant(@RequestBody MerchantDomain merchant) {
        merchantService.addMerchant(merchant);
    }

}
