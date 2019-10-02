package com.ibm.bcamerchant.bcamerchant.Repository;

import com.ibm.bcamerchant.bcamerchant.Domain.BillDomain;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BillRepository extends CrudRepository<BillDomain, String> {

    List<BillDomain> findByMerchantId(int merchantId);

}
