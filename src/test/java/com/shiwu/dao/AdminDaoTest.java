package com.shiwu.dao;

import com.shiwu.entity.Admin;
import com.shiwu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class AdminDaoTest
{
    @Test
    public void test()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try
        {
            AdminDao adminDao = sqlSession.getMapper(AdminDao.class);
            List<Admin> adminList = adminDao.getAdminList();

            for (Admin admin : adminList)
            {
                System.out.println(admin);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }finally
        {
            sqlSession.close();
        }
    }
}
