package com.happy.service.Impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.happy.mapper.FacilitiesTableMapper;
import com.happy.pojo.FacilitiesTable;
import com.happy.service.FacilitiesTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.*;
import java.util.function.Function;
@Service
public class FacilitiesTableServiceImpl implements FacilitiesTableService {
    @Autowired
    FacilitiesTableMapper mapper;

    @Override
    public List<FacilitiesTable> selectAll() {
        return mapper.selectAll();
    }

    public FacilitiesTable selectById(Serializable id) {
        return mapper.selectById(id);
    }


    public List<FacilitiesTable> likeFName(String columnName,Object o) {
        return mapper.selectList(new QueryWrapper<FacilitiesTable>().like(columnName,o));
    }

    public int insert(FacilitiesTable record) {
        return mapper.insert(record);
    }

    public int updateById(FacilitiesTable record){
        return mapper.updateById(record);
    }

    public int deleteById(Long Id){
        return mapper.deleteById(Id);
    }


}
