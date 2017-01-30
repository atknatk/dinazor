package com.dinazor.api.impl;

import com.dinazor.domain.entity.Account;
import com.dinazor.repository.AccountRepository;
import org.springframework.stereotype.Service;

/**
 * Created by atakan on 30.01.2017.
 */
@Service
public class AccountRepositoryImpl implements AccountRepository {
    @Override
    public Account findByNumber(String number) {
        return null;
    }

    @Override
    public <S extends Account> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Account> Iterable<S> save(Iterable<S> entities) {
        return null;
    }

    @Override
    public Account findOne(Long aLong) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Account> findAll() {
        return null;
    }

    @Override
    public Iterable<Account> findAll(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public void delete(Account entity) {

    }

    @Override
    public void delete(Iterable<? extends Account> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
