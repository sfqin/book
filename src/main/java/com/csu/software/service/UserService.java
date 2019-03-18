package com.csu.software.service;

import com.csu.software.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    List<Student> getAllUser();
    Student getUserById(Integer id);
    List<Student> getUserByNameAndAge(String name, Integer age1,Integer age2);
    boolean register( String userAccount, String password, Byte role, String username, String helloWord);
}
