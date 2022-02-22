package com.study.designpattern.adapter;

import com.study.designpattern.adapter.security.UserDetails;

public class AccountUserDetail implements UserDetails {

    Account account;
    public AccountUserDetail(Account account){
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
