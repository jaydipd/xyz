package com.hello.hellospring.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExecuteAddition {

    @RequestMapping(value = "/addition**", method = RequestMethod.GET)
    public ModelAndView additionMethod() {
        ModelAndView model = new ModelAndView();
        model.addObject("message", "im in addition method!");

        model.setViewName("adminprofile");
        return model;
    }
}
