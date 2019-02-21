package com.csu.software.controller;

import com.csu.software.model.Student;
import com.csu.software.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping("searchByID")
    public @ResponseBody Student getUserById(Integer id){
        Student s = userService.getUserById(id);
        return s;
    }

    @RequestMapping("nameAgeStu")
    public @ResponseBody List<Student> getUserByNameAndAge(String name, Integer age1,Integer age2){

        List<Student> nameAgeStudent = userService.getUserByNameAndAge(name, age1, age2);
        return nameAgeStudent;
    }
}
