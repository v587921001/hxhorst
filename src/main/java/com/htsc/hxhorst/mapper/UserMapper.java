package com.htsc.hxhorst.mapper;

import com.htsc.hxhorst.model.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String userCode);

    int insert(User record);

    User selectByPrimaryKey(String userCode);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}