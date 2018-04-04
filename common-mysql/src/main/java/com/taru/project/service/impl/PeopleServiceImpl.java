package com.taru.project.service.impl;


import com.taru.project.mapper.PeopleMapper;
import com.taru.project.model.People;
import com.taru.project.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * ☺
 * @author wangfei
 * @date 2018年3月4日 13:55:05
 * ☺
 *
 */
@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleMapper peopleMapper;

    @Override
    public List<People> getList() {
        return peopleMapper.selectAll();
    }
}
