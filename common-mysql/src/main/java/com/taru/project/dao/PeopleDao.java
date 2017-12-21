package com.taru.project.dao;

import com.taru.project.model.People;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleDao {
        public List<People> getList();
}
