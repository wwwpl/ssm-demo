package com.taru.project.dao.impl;

import com.taru.project.common.BaseDao;
import com.taru.project.dao.PeopleDao;
import com.taru.project.model.People;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * ☺
 * @author wangfei
 * @date 2018年3月4日 13:57:34
 * ☺
 *
 */
public class PeopleDaoImpl implements PeopleDao {

    @Override
    public List<People> getList() {
        List<People> list = null;
        try {
             list = BaseDao.sqlMap.queryForList("getList");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
