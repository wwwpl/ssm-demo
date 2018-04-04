package com.taru.project.mapper;

import com.taru.project.model.People;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangfei33
 * @date 2018年4月4日 10:45:09
 * 测试
 */
@Repository
public interface PeopleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(People record);

    int insertSelective(People record);

    People selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(People record);

    int updateByPrimaryKey(People record);

    List<People> selectAll();
}