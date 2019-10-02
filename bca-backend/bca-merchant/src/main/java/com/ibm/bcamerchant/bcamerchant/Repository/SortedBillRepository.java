package com.ibm.bcamerchant.bcamerchant.Repository;

import com.ibm.bcamerchant.bcamerchant.Domain.SortedBillDomain;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SortedBillRepository extends CrudRepository<SortedBillDomain, Integer> {

    List<SortedBillDomain> findByCombinedMonthAndCombinedYearAndMerchantId(String combinedMonth, String combinedYear, int merchantId);

    List<SortedBillDomain> findByMerchantId(int merchantId);

    List<SortedBillDomain> findByCombinedYearContaining(String combinedYear);
}
