package com.happy.service;

import com.happy.pojo.LineTable;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LineTableService {
    List<LineTable> selectAll();

    LineTable selectById(Long id);

    LineTable selectOneByFacilitiesId(Object o);

    List<LineTable> likeFName(String columnName,Object o);

    int insert(LineTable record);

    int updateById(LineTable record);

    int deleteById(Long Id);
}
