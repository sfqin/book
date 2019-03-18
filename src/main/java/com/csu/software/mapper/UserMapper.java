package com.csu.software.mapper;

import com.csu.software.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int register(@Param("userAccount") String userAccount,
                 @Param("password") String password,
                 @Param("role") int role,
                 @Param("username") String username,
                 @Param("helloWord") String helloWord);

    int login(@Param("userAccount") String userAccount,@Param("password") String password);
}