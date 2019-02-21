package com.csu.software.service;

import com.csu.software.model.Student;

import java.util.List;

public interface UserService {
//111
    List<Student> getAllUser();
    Student getUserById(Integer id);
    List<Student> getUserByNameAndAge(String name, Integer age1,Integer age2);
}
