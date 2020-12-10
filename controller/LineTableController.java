package com.happy.controller;

import com.happy.pojo.LineTable;
import com.happy.pojo.UserLineTable;
import com.happy.service.LineTableService;
import com.happy.service.UserLineTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class LineTableController {
    @Autowired
    LineTableService service;
    @Autowired
    UserLineTableService userLineTableService;

    @RequestMapping("choosePerson")
    public void toChoosePerson(LineTable record,Model model){
        Long userId=10024L;//假设userId是10024L
        int person=10;//假设排队人数是10人
        //1.通过项目id查询到排队信息
        LineTable oneTable=service.selectOneByFacilitiesId(record.getFId());

        //2.把相关信息塞进用户的排队列表
        UserLineTable userLineTable=new UserLineTable();
        userLineTable.setUlId(1L);
        userLineTable.setLId(oneTable.getLId());//排队的id
        userLineTable.setUserId(userId);//用户的id
        userLineTable.setUlCurrentNumber(oneTable.getCurrentNumber());//用户当前的排队人数
        userLineTable.setUlWaitingTime(oneTable.getWaitingTime());//用户当前的排队时间
        userLineTableService.updateById(userLineTable);//更新userLine表

        //3.此时开始向队列表Line添加排队人数
        oneTable.setCurrentNumber(oneTable.getCurrentNumber()+10);
        int lineTime=oneTable.getWaitingTime()+(10/oneTable.getPersonMinute()+1);//新的排队时间
        oneTable.setWaitingTime(lineTime);//插入新的排队时间
        service.updateById(oneTable);//更新line表,测试排队成功


    }
}
