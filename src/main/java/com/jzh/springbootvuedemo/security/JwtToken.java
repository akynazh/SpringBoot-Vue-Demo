package com.jzh.springbootvuedemo.security;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @version 1.0
 * @description token类
 * @Author Jiang Zhihang
 * @Date 2022/2/4 22:57
 */
public class JwtToken implements AuthenticationToken {
    private final String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
