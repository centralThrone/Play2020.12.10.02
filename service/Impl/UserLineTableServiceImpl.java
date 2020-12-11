package com.happy.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.happy.mapper.UserLineTableMapper;
import com.happy.pojo.UserLineTable;
import com.happy.service.UserLineTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public boolean oneUserOneProject(Long userId, Long lineId) {
        Map<String, Object> columnMap = new HashMap<String, Object>();
        columnMap.put("user_id",userId);
        columnMap.put("l_id",lineId);
        return  mapper.selectByMap(columnMap).size()!=0;
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
