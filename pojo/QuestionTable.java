package com.happy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QuestionTable {
    @TableId(value = "q_id",type = IdType.AUTO)//唯一标示
    private Long qId;
    //公告题目
    private String qTitle;
    //公告信息
    private String qMessage;
    //排序
    private Integer qOrderBy;
}
