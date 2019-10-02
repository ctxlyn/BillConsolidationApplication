package com.ibm.bcamerchant.bcamerchant.Repository;

import com.ibm.bcamerchant.bcamerchant.Domain.MerchantDomain;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MerchantRepository extends CrudRepository<MerchantDomain, String> {
}
