package com.happy.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.happy.mapper.UserLineTableMapper;
import com.happy.pojo.UserLineTable;
import com.happy.service.UserLineTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLineTableServiceImpl implements UserLineTableService {
    @Autowired
    UserLineTableMapper mapper;

    @Override
    public List<UserLineTable> selectAll() {
        return mapper.selectList(null);
    }

    @Override
    public UserLineTable selectById(Long id) {
        return mapper.selectById(id);
    }
    @Override
    public List<UserLineTable> likeFName(String columnName,Object o) {
        return mapper.selectList(new QueryWrapper<UserLineTable>().like(columnName,o));
    }
    @Override
    public int insert(UserLineTable record) {
        return mapper.insert(record);
    }
    @Override
    public int updateById(UserLineTable record){
        return mapper.updateById(record);
    }
    @Override
    public int deleteById(Long Id){
        return mapper.deleteById(Id);
    }
}
