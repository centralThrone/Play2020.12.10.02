package com.happy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.happy.pojo.FacilitiesTable;
import com.happy.pojo.LineTable;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LineTableMapper  extends BaseMapper<LineTable> {

}
