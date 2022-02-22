package com.study.designpattern.adapter;

import com.study.designpattern.adapter.security.UserDetails;
import com.study.designpattern.adapter.security.UserDetailsService;

public class AccountService implements UserDetailsService {
    @Override
    public UserDetails loadUser(String username) {
        return findAccountByUsername(username);
    }

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

}
