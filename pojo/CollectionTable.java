package com.happy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@NoArgsConstructor
public class CollectionTable {
    @TableId(value="c_id",type = IdType.AUTO)//主键
    private Long cId;
    //用户id
    private Long userId;
    //项目id
    private Long fId;
}
