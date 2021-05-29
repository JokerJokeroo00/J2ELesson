package com.shiwu.service;

import com.shiwu.entity.Admin;
import com.shiwu.service.impl.LoginServiceImpl;
import org.junit.Test;

public class LoginServiceTest
{
    private LoginService loginService = new LoginServiceImpl();

    @Test
    public void test()
    {
        String username = "shiwu";
        String password = "123456";
        Admin admin = (Admin) loginService.login(username, password);
        if (admin != null)
        {
            System.out.println("success");
        } else
        {
            System.out.println("error");
        }
    }
}
