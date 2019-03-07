package com.csu.software.mapper;

import com.csu.software.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> getAllStu();

    Student getUserById(Integer id);

    List<Student> getUserByNameAndAge(String name, Integer age1, Integer age2);

   /* List<Student> getUserByNameAndAge1(@Param("name") String name, @Param("age1") Integer age1, @Param("age2") Integer age2);

    List<Student> getUserByNameAndAge2(String name, Integer age1, Integer age2);

    List<Student> getUserByNameAndAge(Map param)
    */
   //boolean register(String user_account,String password,int role,String username,String hello_word);


}