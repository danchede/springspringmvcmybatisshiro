package com.ifox.dao;

import com.ifox.entity.User;

import java.util.Set;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in15:33 2018/4/14
 * @Modified By:
 */
public interface UserDao {
    /**
     * 通过用户名查询用户
     * @param userName
     * @return
     */
     User getByUserName(String userName);

    /**
     * 通过用户名查询角色信息
     * @param userName
     * @return
     */
     Set<String> getRoles(String userName);

    /**
     * 通过用户名查询权限信息
     * @param userName
     * @return
     */
     Set<String> getPermissions(String userName);
}
