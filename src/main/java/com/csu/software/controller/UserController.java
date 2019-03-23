package com.csu.software.controller;

import com.csu.software.controller.vo.BaseResult.BaseResult;
import com.csu.software.controller.vo.UserReq;
import com.csu.software.model.Student;
import com.csu.software.model.User;
import com.csu.software.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private HttpServletRequest request;


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

    @PostMapping("login")
    public BaseResult login(@RequestBody UserReq loginUser){
        BaseResult baseResult = new BaseResult();
        String userAccount = loginUser.getUserAccount();
        String password = loginUser.getPassword();
        if(StringUtils.isEmpty(userAccount) || StringUtils.isEmpty(password)){
            baseResult.setCode(599999999);
            baseResult.setMessage("账号或者密码不能为空");
            return baseResult;
        }
        User login = userService.login(userAccount, password);
        if(login != null){
            baseResult.setCode(0);
            baseResult.setMessage("success");
            request.getSession().setAttribute("userInfo",login);

        }else {
            baseResult.setCode(499999999);
            baseResult.setMessage("账号或者密码错误");
        }
        return baseResult;
    }

    @PostMapping("/logout")
    public BaseResult logout(){
        request.getSession().invalidate();
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(0);
        baseResult.setMessage("退出成功");
        return baseResult;
    }

}
