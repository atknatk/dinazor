package com.dinazor.api.impl;

/**
 * Created by atakan on 30.01.2017.
 */

import java.util.ArrayList;
import java.util.List;

import com.dinazor.api.service.AccountNotFoundException;
import com.dinazor.api.service.AccountService;
import com.dinazor.domain.entity.Account;
import com.dinazor.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {

    @Value("${dummy.type}")
    private String dummyType;

    @Autowired
    private AccountRepository accountRepository;

    /**
     * {@inheritDoc}
     * <p/>
     * Dummy method for testing purposes.
     *
     * @param number The account number. Set 0000 to get an {@link AccountNotFoundException}
     */
    @Override
    public Account findOne(String number) throws AccountNotFoundException {
        if(number.equals("0000")) {
            throw new AccountNotFoundException("0000");
        }

        Account account = accountRepository.findByNumber(number);
        if(account == null){
            account = createAccountByNumber(number);
        }

        return account;
    }

    @Override
    public Account createAccountByNumber(String number) {
        Account account = new Account();
        account.setNumber(number);
        return accountRepository.save(account);
    }

    public String getDummyType() {
        return dummyType;
    }

    public void setDummyType(String dummyType) {
        this.dummyType = dummyType;
    }

}