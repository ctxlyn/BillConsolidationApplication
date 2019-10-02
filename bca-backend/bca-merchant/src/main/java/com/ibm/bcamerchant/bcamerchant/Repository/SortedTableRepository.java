package com.ibm.bcamerchant.bcamerchant.Repository;

import com.ibm.bcamerchant.bcamerchant.Domain.SortedTable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SortedTableRepository extends CrudRepository<SortedTable, Integer> {
    List<SortedTable> findByCombinedMonthAndCombinedYear(String month, String year);

    List<SortedTable> findByCombinedYearContaining(String year);
}
