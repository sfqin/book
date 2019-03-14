package com.csu.software.controller;

import com.csu.software.controller.vo.UserReq;
import com.csu.software.model.Student;
import com.csu.software.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "register" , method = RequestMethod.POST)
    public @ResponseBody  String register(@RequestBody UserReq user){

        String userAccount = user.getUserAccount();
        String password = user.getPassword();
        Byte role = user.getRole();
        String username = user.getUserName();
        String helloWord = user.getHelloWord();

        boolean result = userService.register(userAccount,password,role,username,helloWord);
        if(result){
            return  "注册成功";
        }
        else{
            return "注册失败，请重新注册";
        }
    }
}
