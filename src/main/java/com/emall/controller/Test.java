package com.emall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/11/28 0028.
 */
@Controller
public class Test {
    @RequestMapping("test.do")
    public String test(){
        System.out.println("sucess");
        return "redirect:/index.jsp";
    }



}
