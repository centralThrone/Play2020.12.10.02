package com.happy.service;

import com.happy.pojo.UserLineTable;

import java.util.List;

public interface UserLineTableService {
    List<UserLineTable> selectAll();

    UserLineTable selectById(Long id);

    List<UserLineTable> likeFName(String columnName,Object o);

    int insert(UserLineTable record);

    int updateById(UserLineTable record);

    int deleteById(Long Id);
}
