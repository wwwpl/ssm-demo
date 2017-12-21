package com.taru.project.controller;

import com.taru.project.model.People;
import com.taru.project.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RestfulController {

    @Autowired
    PeopleService peopleService;

    @RequestMapping("/abs")
    public String restful(Model model){
        List<People> list = peopleService.getList();
        model.addAttribute("people",list);
        return "abs";
    }
}
