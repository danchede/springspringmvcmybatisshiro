package com.ifox.service.impl;

import com.ifox.dao.UserDao;
import com.ifox.entity.User;
import com.ifox.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in15:34 2018/4/14
 * @Modified By:
 */
@Service("userservice")

public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public User getByUserName(String userName) {
        return userDao.getByUserName(userName);
    }

    public Set<String> getRoles(String userName) {
        return userDao.getRoles(userName);
    }

    public Set<String> getPermissions(String userName) {
        return userDao.getPermissions(userName);
    }

}
