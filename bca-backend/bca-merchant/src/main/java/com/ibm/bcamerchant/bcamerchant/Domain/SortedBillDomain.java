package com.ibm.bcamerchant.bcamerchant.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class SortedBillDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sbId;
    private int merchantId;
    private BigDecimal combinedTotal;
    private String combinedMonth;
    private String combinedYear;

    public SortedBillDomain() {
    }

    public SortedBillDomain(int sbId, int merchantId, BigDecimal combinedTotal, String combinedMonth, String combinedYear) {
        this.sbId = sbId;
        this.merchantId = merchantId;
        this.combinedTotal = combinedTotal;
        this.combinedMonth = combinedMonth;
        this.combinedYear = combinedYear;
    }

    public int getSbId() {
        return sbId;
    }

    public void setSbId(int sbId) {
        this.sbId = sbId;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public BigDecimal getCombinedTotal() {
        return combinedTotal;
    }

    public void setCombinedTotal(BigDecimal combinedTotal) {
        this.combinedTotal = combinedTotal;
    }

    public String getCombinedMonth() {
        return combinedMonth;
    }

    public void setCombinedMonth(String combinedMonth) {
        this.combinedMonth = combinedMonth;
    }

    public String getCombinedYear() {
        return combinedYear;
    }

    public void setCombinedYear(String combinedYear) {
        this.combinedYear = combinedYear;
    }
}
