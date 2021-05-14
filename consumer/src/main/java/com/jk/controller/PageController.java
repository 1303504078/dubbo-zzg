package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {
    @RequestMapping("zs")
    public String show(){
        return "zs";
    }
    @RequestMapping("xz")
    public String xz(){
        return "xz";
    }
    @RequestMapping("fx")
    public String user2(){
        return "fx";
    }
    @RequestMapping("add")
    public String add(){
        return "add";
    }

}
