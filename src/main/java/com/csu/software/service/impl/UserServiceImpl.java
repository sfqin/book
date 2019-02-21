package com.csu.software.service.impl;

import com.csu.software.mapper.StudentMapper;
import com.csu.software.model.Student;
import com.csu.software.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private StudentMapper studentMapper;


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


}

