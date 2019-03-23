package com.csu.software.service.impl;

import com.csu.software.mapper.StudentMapper;
import com.csu.software.mapper.UserMapper;
import com.csu.software.model.Student;
import com.csu.software.model.User;
import com.csu.software.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private UserMapper  userMapper;

    @Override
    public List<Student> getAllUser() {

        List<Student> allStu = studentMapper.getAllStu();
        return allStu;
    }

    @Override
    public Student getUserById(Integer id) {
        Student s = studentMapper.getUserById(id);
        return s;
    }

    @Override
    public List<Student> getUserByNameAndAge(String name, Integer age1, Integer age2) {
        List<Student> nameAgeStudent = studentMapper.getUserByNameAndAge(name, age1, age2);
        return nameAgeStudent;
    }

    @Override
    public boolean register(String userAccount, String password, Byte role, String username, String helloWord) {
        int result = userMapper.register(userAccount,password,role,username,helloWord);
        if (result==1){
            return true;
        }else {
            return false;

        }
    }

    @Override
    public User login(String userAccount, String passwd) {
        User login = userMapper.login(userAccount, passwd);

        return login;
    }


}

