package com.ibm.bcamerchant.bcamerchant.Controller;

import com.ibm.bcamerchant.bcamerchant.Domain.SortedTable;
import com.ibm.bcamerchant.bcamerchant.Repository.SortedTableRepository;
import com.ibm.bcamerchant.bcamerchant.Service.SortedTableService;
import net.bytebuddy.TypeCache;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class SortedTableController {

    @Autowired
    private SortedTableService sortedTableService;

    @RequestMapping(value = "/getSortedTable", method = RequestMethod.GET)
    public List<SortedTable> getSortedTable(){
         return sortedTableService.getSortedTable();
    }


    @RequestMapping(value = "/getByMonthAndYear/{month}/{year}", method = RequestMethod.GET)
    public List<SortedTable> getByMonthAndYear(@PathVariable String month, @PathVariable String year){
        return sortedTableService.getByMonthAndYear(month, year);
    }

    @RequestMapping(value = "/getByCombinedYear/{year}", method = RequestMethod.GET)
    public List<SortedTable> getByCombinedYear(@PathVariable String year){
        return sortedTableService.getByCombinedYear(year);
    }

    @RequestMapping(value = "/addSorted", method = RequestMethod.POST)
    public SortedTable addSorted(@RequestBody SortedTable sortedTable){
        return sortedTableService.addSorted(sortedTable);
    }

}
