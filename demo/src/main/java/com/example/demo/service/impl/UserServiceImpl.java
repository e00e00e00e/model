package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public void save(User user) {
        // TODO Auto-generated method stub
        userDao.save(user);
    }

    @Override
    public List<User> getUserList() {
        return userDao.findAll();
    }

}
