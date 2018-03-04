package com.taru.project.dao;

import com.taru.project.model.People;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 *
 * ☺
 * @author wangfei
 * @date 2018年3月4日 13:58:02
 * ☺
 *
 */

public interface PeopleDao {
        public List<People> getList();
}
