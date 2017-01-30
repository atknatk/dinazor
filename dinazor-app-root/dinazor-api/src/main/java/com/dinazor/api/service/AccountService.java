package com.dinazor.api.service;

import com.dinazor.domain.entity.Account;
import org.springframework.context.annotation.Configuration;

/**
 * Created by atakan on 30.01.2017.
 */
//@Configuration(value = "myEnviroment")
public interface AccountService {
    /**
     * Finds the account with the provided account number.
     *
     * @param number The account number
     * @return The account
     * @throws AccountNotFoundException If no such account exists.
     */
    Account findOne(String number) throws AccountNotFoundException;

    /**
     * Creates a new account.
     *
     * @param number
     * @return created account
     */
    Account createAccountByNumber(String number);
}
