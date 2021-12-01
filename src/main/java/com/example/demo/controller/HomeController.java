package com.example.demo.controller;

import com.example.demo.Pojo.person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@Api(tags = "HomeController控制类")
public class HomeController {
    @GetMapping("/")
    @ApiOperation(value = "跳转首页",response = person.class,notes = "这里是跳转首页详细信息...")
    public String goHOme(){
        return "index";
    }
    @GetMapping("/person")
    @ApiOperation(value = "获得所有用户",response = person.class,notes = "这里是详细信息...")
    @ResponseBody
    public List<person> getPerson(){
        return new ArrayList<>(Arrays.asList(new person("4w",18)));
    }
}
