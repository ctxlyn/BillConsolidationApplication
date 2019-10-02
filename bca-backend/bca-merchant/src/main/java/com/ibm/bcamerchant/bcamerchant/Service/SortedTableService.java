package com.ibm.bcamerchant.bcamerchant.Service;

import com.ibm.bcamerchant.bcamerchant.Repository.SortedTableRepository;
import com.ibm.bcamerchant.bcamerchant.Domain.SortedTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SortedTableService {

    @Autowired
    private SortedTableRepository sortedTableRepository;

    public List<SortedTable> getSortedTable(){
        List<SortedTable> sorted = new ArrayList<>();
        sortedTableRepository.findAll().forEach(sorted::add);
        return sorted;
    }

    public List<SortedTable> getByMonthAndYear(String month, String year){
        List<SortedTable> sorted = new ArrayList<>();
        sortedTableRepository.findByCombinedMonthAndCombinedYear(month, year).forEach(sorted::add);
        return sorted;
    }

    public SortedTable addSorted(SortedTable sortedTable){
        return sortedTableRepository.save(sortedTable);
    }

    public List<SortedTable> getByCombinedYear(String year) {
        List<SortedTable> sorted = new ArrayList<>();
        sortedTableRepository.findByCombinedYearContaining(year).forEach(sorted::add);
        return sorted;
    }
}
