package com.happy.service.Impl;

import com.happy.mapper.CollectionTableMapper;
import com.happy.service.CollectionTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectionTableServiceImpl implements CollectionTableService {
    @Autowired
    CollectionTableMapper mapper;
}
