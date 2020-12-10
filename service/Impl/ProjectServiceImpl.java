package com.happy.service.Impl;

import com.happy.mapper.ProjectMapper;
import com.happy.pojo.Project;
import com.happy.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectMapper mapper;
    public List<Project> selectAll(){
        return mapper.selectList(null);
    }
}
