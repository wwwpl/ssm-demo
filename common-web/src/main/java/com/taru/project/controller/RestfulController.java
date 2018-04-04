package com.taru.project.controller;

import com.taru.project.mapper.PeopleMapper;
import com.taru.project.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * ☺
 * @author wangfei
 * @date 2018年3月4日 13:55:05
 * ☺
 *
 */
@Controller
public class RestfulController {



    @RequestMapping("/")
    public String restful(){
        return "common";
    }
}
