package com.happy.service.Impl;

import com.happy.mapper.InfoTableMapper;
import com.happy.service.InfoTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoTableServiceImpl implements InfoTableService {
    @Autowired
    InfoTableMapper mapper;
}
