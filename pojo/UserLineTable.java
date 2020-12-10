package com.happy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserLineTable {
    @TableId(value = "ul_id",type = IdType.AUTO)//唯一标识
    private Long ulId;
    //用户id
    private Long userId;
    //项目排队情况id
    private Long lId;
    //用户的排队时间
    private Integer ulWaitingTime;
    //用户的当前人数
    private Integer ulCurrentNumber;
    //优先级,1表示正在排队,2,3,4,5表示参与排队的先后顺序
    private Long level;

}
