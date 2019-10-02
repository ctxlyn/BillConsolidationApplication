package com.ibm.bcamerchant.bcamerchant.Domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class SortedTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sortingId;
    private String combinedMonth;
    private String combinedYear;
    private BigDecimal combinedTotal;

    public SortedTable() {
    }

    public SortedTable(int sortingId, String combinedMonth, String combinedYear, BigDecimal combinedTotal, Date dueDate) {
        this.sortingId = sortingId;
        this.combinedMonth = combinedMonth;
        this.combinedYear = combinedYear;
        this.combinedTotal = combinedTotal;
    }


    public int getSortingId() {
        return sortingId;
    }

    public void setSortingId(int sortingId) {
        this.sortingId = sortingId;
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

    public BigDecimal getCombinedTotal() {
        return combinedTotal;
    }

    public void setCombinedTotal(BigDecimal combinedTotal) {
        this.combinedTotal = combinedTotal;
    }
}
