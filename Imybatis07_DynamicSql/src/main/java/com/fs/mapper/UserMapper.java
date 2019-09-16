package com.fs.mapper;

import java.util.List;
import com.fs.po.User;

public interface UserMapper {
    int insertUser(User user);
    int deleteByMultipleFields(User user);
    int deleteByOneField(User user);
    int update(User user);
    List<User> selectByByMultipleFields1(User user);
    List<User> selectByByMultipleFields2(User user);
    List<User> selectIn(int[] ids);
}