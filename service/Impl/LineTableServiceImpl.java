package com.happy.service.Impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.happy.mapper.LineTableMapper;
import com.happy.pojo.FacilitiesTable;
import com.happy.pojo.LineTable;
import com.happy.service.LineTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class LineTableServiceImpl implements LineTableService {
    @Autowired
    LineTableMapper mapper;

    @Override
    public List<LineTable> selectAll() {
        return mapper.selectList(null);
    }

    @Override
    public LineTable selectById(Long id) {
        return mapper.selectById(id);
    }
    @Override
    public LineTable selectOneByFacilitiesId(Object o) {
        return mapper.selectOne(new QueryWrapper<LineTable>().like("f_id",o));
    }
    @Override//模糊查询
    public List<LineTable> likeFName(String columnName,Object o) {
        return mapper.selectList(new QueryWrapper<LineTable>().like(columnName,o));
    }
    @Override
    public int insert(LineTable record) {
        return mapper.insert(record);
    }
    @Override
    public int updateById(LineTable record){
        return mapper.updateById(record);
    }
    @Override
    public int deleteById(Long Id){
        return mapper.deleteById(Id);
    }
}
