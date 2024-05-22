package org.example.people.dao;



import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.people.pojo.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao {

    @Select("select * from user where username = #{username}")
    User getByUsername(String username);
}
