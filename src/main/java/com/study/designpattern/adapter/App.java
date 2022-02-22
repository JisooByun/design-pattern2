package com.study.designpattern.adapter;

import com.study.designpattern.adapter.security.LoginHandler;
import com.study.designpattern.adapter.security.UserDetailsService;

public class App {

    public static void main(String[] args) {

        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        loginHandler.login("jisoo", "jisoo");

        LoginHandler loginHandler1 = new LoginHandler(new AccountService());
        loginHandler.login("jisoo", "jisoo");

    }
}
