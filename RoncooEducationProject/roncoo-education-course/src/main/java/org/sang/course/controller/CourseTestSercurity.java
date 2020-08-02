package org.sang.course.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseTestSercurity {
    @GetMapping("/caiwu/hello/hello")
    public String caiwu(){
        System.out.println("你好财务");
        return "你好财务";
    }
    @GetMapping("/user/user/hello")
    public String user(){
        System.out.println("你好普通用户");
        return "你好普通用户";
    }
    @GetMapping("/course/course/hello")
    public String course(){
        System.out.println("你好admin");
        return "你好admin";
    }
    @GetMapping("/system/course/hello")
    public String dba(){
        System.out.println("你好dba");
        return "你好dba";
    }
}
