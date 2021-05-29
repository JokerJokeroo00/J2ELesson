package com.shiwu.controller;

import com.shiwu.service.LoginService;
import com.shiwu.service.impl.LoginServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet
{
    private LoginService loginService = new LoginServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String username = request.getParameter("login_name");
        String password = request.getParameter("login_password");
        Object object = loginService.login(username, password);
        if (object != null)
        {

        }
    }
}
