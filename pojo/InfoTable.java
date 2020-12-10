package com.happy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class InfoTable {
    @TableId(value = "info_id",type = IdType.AUTO)//主键
    private Long infoId;
    //标题
    private String infoTitle;
    //内容
    private String infoMessage;
    //发布时间(date形式)
    private Date infoTime;
    //发布时间点的字符串形式(12:25)
    private String infoTimeString;
    //发布的日子(字符串形式)
    private String infoDayString;
    //发布类型(自动发布,手动发布)
    private String infoMethod;
    //消息类型(公告,关注项目动态,项目开始动态,排队动态)
    private String infoType;
    //对应图标
    private String infoLogo;
}
