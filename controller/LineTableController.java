package com.happy.controller;

import com.happy.pojo.LineTable;
import com.happy.pojo.Project;
import com.happy.pojo.UserLineTable;
import com.happy.service.LineTableService;
import com.happy.service.ProjectService;
import com.happy.service.UserLineTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class LineTableController {
    @Autowired
    LineTableService service;
    @Autowired
    UserLineTableService userLineTableService;
    @Autowired
    ProjectService projectService;
    @RequestMapping("choosePerson")
    public String toChoosePerson(LineTable record,Model model){
        Long userId=10024L;//假设userId是10024L
        int person=10;//假设排队人数是10人
        //1.通过项目id查询到排队信息
        LineTable lineTable=service.selectOneByFacilitiesId(record.getFId());
        if(lineTable==null){
            model.addAttribute("fail","查询队列失败");
            return "fail";
        }
        //2.把相关信息塞进用户的排队列表

        //检查存不存在用户列
        boolean isExists=userLineTableService.oneUserOneProject(userId,lineTable.getLId());
        if(isExists){
            model.addAttribute("fail","已经在排队中,请等待");
            Project project=projectService.selectOneByFacilitiesId(record.getFId());
            model.addAttribute("project",project);
            return "online";
        }
        UserLineTable userLineTable=new UserLineTable();
        userLineTable.setLId(lineTable.getLId());//排队的id
        userLineTable.setUserId(userId);//用户的id
        userLineTable.setUlCurrentNumber(lineTable.getCurrentNumber());//用户当前的排队人数
        userLineTable.setUlWaitingTime(lineTable.getWaitingTime());//用户当前的排队时间
        userLineTableService.insert(userLineTable);//插入userLine表

        //3.此时开始向队列表Line添加排队人数
        lineTable.setCurrentNumber(lineTable.getCurrentNumber()+10);
        if(lineTable.getPersonMinute()==0){//某些项目一天一场，不需要排队
            model.addAttribute("fail","此项目不需要排队");
            return "fail";
        }
        int lineTime=lineTable.getWaitingTime()+(10/lineTable.getPersonMinute()+1);//新的排队时间
        lineTable.setWaitingTime(lineTime);//插入新的排队时间
        service.updateById(lineTable);//更新line表,测试排队成功

        Project project=projectService.selectOneByFacilitiesId(record.getFId());
        model.addAttribute("project",project);
        return "online";
    }


}
