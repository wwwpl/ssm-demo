package com.taru.project.controller;

import com.taru.project.model.People;
import com.taru.project.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
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

    @Autowired
    PeopleService peopleService;

    @RequestMapping("/")
    public String restful(){
        return "Frame";
    }
    @RequestMapping("/paly")
    public String paly(){
        return "font/single";
    }

}
