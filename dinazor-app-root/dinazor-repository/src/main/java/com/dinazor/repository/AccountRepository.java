package com.dinazor.repository;

import com.dinazor.domain.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by atakan on 30.01.2017.
 */
@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    Account findByNumber(String number);

}