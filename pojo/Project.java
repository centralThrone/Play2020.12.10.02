package com.happy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Project {
    private Long lId;
    //当前排队人数
    private Integer currentNumber;
    //预计等待时间
    private Integer waitingTime;
    //每分钟离开的人数
    private Integer personMinute;
    //设备ID
    private Long fId;
    //设备名称
    private String fName;
    //项目介绍
    private String fIntroduce;
    @TableField("onceTime")//该项目一轮所用时间
    private Integer onceTime;
    //每轮之间的时间间隔
    private Integer fInterval;
    //项目承载的人数
    private Integer fPerson;
    //早上开始时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date startTime;
    //晚上结束时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date endTime;
    //开始时间的字符串形式
    private String startTimeString;
    //结束时间的字符串形式
    private String endTimeString;
    ///热度
    private Integer hotLevel;
    //项目图片地址
    private String fImg;
    //项目当前开启还是关闭
    private String fState;
    //对应地图坐标
    private String fLocation;
    //适合玩的人群
    private String fTarget;
    //惊险程度
    private String fThreat;

    public static void main(String[] args) {

    }

}
