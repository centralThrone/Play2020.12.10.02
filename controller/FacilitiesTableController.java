package com.happy.controller;

import com.happy.pojo.FacilitiesTable;
import com.happy.pojo.LineTable;
import com.happy.pojo.Project;
import com.happy.service.FacilitiesTableService;
import com.happy.service.LineTableService;
import com.happy.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FacilitiesTableController {

    @Autowired
    FacilitiesTableService facilitiesTableService;
    @Autowired
    ProjectService projectService;

    @RequestMapping("index")
    public String selectAll(Model model){
        List<Project> list=projectService.selectAll();
        if(list.size()==0){
            model.addAttribute("fail","查询失败");
        }
        model.addAttribute("list",list);
        return "index";
    }

}
