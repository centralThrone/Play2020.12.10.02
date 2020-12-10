package com.happy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.happy.pojo.FacilitiesTable;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacilitiesTableMapper extends BaseMapper<FacilitiesTable> {
    @Select("SELECT f.*,l.current_number,l.waiting_time FROM facilities_table f,line_table l\n" +
            "  WHERE l.f_id=f.`f_id`")
    List<FacilitiesTable> selectAll();
}
