package com.happy.service;

import com.happy.pojo.Project;

import java.util.List;

public interface ProjectService {
    List<Project> selectAll();

    Project selectOneByFacilitiesId(Object o);
}
