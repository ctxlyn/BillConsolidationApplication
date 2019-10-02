package com.ibm.bcamerchant.bcamerchant.Domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class MerchantDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int merchantId;
    private String merchantName;

    public MerchantDomain() {
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }


    @Override
    public String toString (){
        return "MerchantId: " + merchantId + " PersonName: " + merchantName;
    }

}
