package com.service.impl;


import com.dao.IUserDao;
import com.model.User;
import com.service.IUserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/6/18.
 */
public class UserServiceImpl implements IUserService {

    private static Log logger = LogFactory.getLog(UserServiceImpl.class);

    IUserDao userDao;

    
    public User getUserById(int userId) {
        return userDao.getUserById(userId);
    }

    
    public User getUserByMapSql(Map<String, String> param) {
        return userDao.getUserByMapSql(param);
    }

    
    public List<User> getUserListByMapSql(Map<String, String> param) {
        return userDao.getUserListByMapSql(param);
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}