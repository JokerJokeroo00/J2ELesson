package com.shiwu.entity;

public class Admin
{
    private Integer adm_id;
    private String login_name;
    private String login_password;

    public Admin(Integer adm_id, String login_name, String login_password)
    {
        this.adm_id = adm_id;
        this.login_name = login_name;
        this.login_password = login_password;
    }

    public Integer getAdm_id()
    {
        return adm_id;
    }

    public void setAdm_id(Integer adm_id)
    {
        this.adm_id = adm_id;
    }

    public String getLogin_name()
    {
        return login_name;
    }

    public void setLogin_name(String login_name)
    {
        this.login_name = login_name;
    }

    public String getLogin_password()
    {
        return login_password;
    }

    public void setLogin_password(String login_password)
    {
        this.login_password = login_password;
    }
}
