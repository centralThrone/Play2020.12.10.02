package com.happy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.happy.pojo.FacilitiesTable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;


public interface FacilitiesTableService{

    List<FacilitiesTable> selectAll();

    FacilitiesTable selectById(Serializable id);

    List<FacilitiesTable> likeFName(String columnName,Object o);

    int insert(FacilitiesTable record);

    int updateById(FacilitiesTable record);

    int deleteById(Long Id);
}
