package com.study.designpattern.chainresponsibility.injava;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/hello")
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("필터 시작");
//        chain.doFilter(request, response);
//        System.out.println("필터 끝");
    }
}
