package net.ysjss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//学生的操作界面

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/index")
    public String index(){  //列表
        return "curd/student.html";
    }
}
