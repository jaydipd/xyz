package com.hello.hellospring.controller;


import com.hello.hellospring.service.ExecuteAddition;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    public HelloController(){
        System.out.print("*********this is HelloController*************");
    }

    @RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
    public ModelAndView welcomePage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is welcome page!");
        model.setViewName("hello");
        return model;

    }

    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is admin page!");

        model.setViewName("admin");

        return model;

    }

    @RequestMapping(value = "/adminprofile**", method = RequestMethod.GET)
    public ModelAndView adminProfile() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is admin profile page!");
        model.setViewName("adminprofile");
        model.addObject("mess",new ExecuteAddition().additionMethod().getModel().get("message"));
        return model;

    }

    @RequestMapping(value = "/guest**", method = RequestMethod.GET)
    public ModelAndView guestPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is guest  page!");

        model.setViewName("guest");

        return model;

    }

    @RequestMapping(value = "/user**", method = RequestMethod.GET)
    public ModelAndView userPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is user  page!");

        model.setViewName("user");

        return model;

    }

}