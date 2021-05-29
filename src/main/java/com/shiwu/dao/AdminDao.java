package com.shiwu.dao;

import com.shiwu.entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminDao
{
    List<Admin> getAdminList();

    Admin login(String login_name, String password);
}
