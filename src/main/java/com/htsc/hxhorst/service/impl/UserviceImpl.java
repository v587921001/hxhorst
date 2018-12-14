package com.htsc.hxhorst.service.impl;

import com.htsc.hxhorst.mapper.UserMapper;
import com.htsc.hxhorst.model.User;
import com.htsc.hxhorst.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserviceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findList() {
        return userMapper.selectAll();
    }
}
