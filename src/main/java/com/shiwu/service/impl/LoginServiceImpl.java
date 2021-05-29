package com.shiwu.service.impl;

import com.shiwu.dao.AdminDao;
import com.shiwu.entity.Admin;
import com.shiwu.service.LoginService;
import com.shiwu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class LoginServiceImpl implements LoginService
{
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    private AdminDao adminDao = sqlSession.getMapper(AdminDao.class);

    @Override
    public Object login(String login_name, String login_password)
    {
        return adminDao.login(login_name, login_password);
    }
}
