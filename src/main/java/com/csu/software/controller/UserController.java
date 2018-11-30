package com.csu.software.controller;

import com.csu.software.model.Student;
import com.csu.software.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("all")
    public @ResponseBody Map<Integer,Student> getUser(){

        List<Student> allUser = userService.getAllUser();

        Map<Integer, Student> collect = allUser.stream().collect(Collectors.toMap(Student::getId, a -> a));

        return collect;
    }
}
