package com.csu.software.service.impl;

import com.csu.software.mapper.StudentMapper;
import com.csu.software.model.Student;
import com.csu.software.service.UserService;
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
}
