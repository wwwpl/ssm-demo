package com.taru.project.service.serviceImpl;

import com.taru.project.dao.PeopleDao;
import com.taru.project.model.People;
import com.taru.project.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    PeopleDao peopleDao;

    public List<People> getList(){
      return peopleDao.getList();
    };
}