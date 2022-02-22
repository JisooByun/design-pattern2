package com.study.designpattern.adapter;

import com.study.designpattern.adapter.security.UserDetails;
import com.study.designpattern.adapter.security.UserDetailsService;
import org.springframework.stereotype.Controller;

//UserDetailService는 client 코드에서 사용할 코드
//accountService는 adaptee로 어댑터를 이용하여 붙일코드이다
//즉 클라이언트가 사용할 수 있게 클라이언트에서 사용하는 인터페이스를 구현하면서 내부에는 붙일 객체를 상태로 가지고 있다
//클라이언트가 요청시에 내부적으로 adaptee를 사용하여 로직을 수행한다.
@Controller
public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUsername(username); // Account를 UserDetail로 만들어줘야함, 클라이언트 코드가 UserDetail 인터페이스를 참조하므로 UserDetail(클라이언트의 타켓)을 implement한 adapter를 만들어주면됨,
        return new AccountUserDetail(accountByUsername);
    }
}
