package com.ibm.bcamerchant.bcamerchant.Domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class BillDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billId;
    private int merchantId;
    private BigDecimal amountDue;
    private String serialNo;
    @Temporal(TemporalType.DATE)
    private Date billDate;
    @Temporal(TemporalType.DATE)
    private Date dueDate;

    public BillDomain() {
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString (){
        return "PhoneId: " + billId + " PersonId: " + merchantId
                + " Brand: " + amountDue + " Model: " + serialNo
                + " BillDate: " + billDate + " DueDate: " + dueDate;
    }

}
