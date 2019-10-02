package com.ibm.bcamerchant.bcamerchant.Service;


import com.ibm.bcamerchant.bcamerchant.Domain.BillDomain;
import com.ibm.bcamerchant.bcamerchant.Domain.MerchantDomain;
import com.ibm.bcamerchant.bcamerchant.Repository.BillRepository;
import com.ibm.bcamerchant.bcamerchant.Repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MerchantService {

    @Autowired
    private MerchantRepository merchantRepository;

    public List<MerchantDomain> getAllMerchants() {
        List<MerchantDomain> merchants = new ArrayList<>();
        merchantRepository.findAll().forEach(merchants::add);
        return merchants;
    }

    public void addMerchant (MerchantDomain merchant) {
        merchantRepository.save(merchant);
    }


}
