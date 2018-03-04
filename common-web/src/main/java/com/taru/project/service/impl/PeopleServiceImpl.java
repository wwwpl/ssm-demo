package com.taru.project.service.impl;

import com.taru.project.dao.PeopleDao;
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
    PeopleDao peopleDao;

    @Override
    public List<People> getList() {
        return peopleDao.getList();
    }
}
