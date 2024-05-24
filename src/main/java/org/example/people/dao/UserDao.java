package org.example.people.dao;



import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.people.pojo.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao {

    @Select("select * from user where username = #{username}")
    User getByUsername(String username);

    @Update("UPDATE user SET password = #{password} WHERE username = #{username}")
    void updatePasswordByUsername(User user);

}
