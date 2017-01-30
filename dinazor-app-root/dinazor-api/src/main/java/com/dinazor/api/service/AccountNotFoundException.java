package com.dinazor.api.service;

/**
 * Created by atakan on 30.01.2017.
 */
public class AccountNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -3891534644498426670L;

    public AccountNotFoundException(String accountId) {
        super("No such account with id: " + accountId);
    }
}
