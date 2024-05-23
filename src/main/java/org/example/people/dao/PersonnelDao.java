package org.example.people.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.people.pojo.Personnel;

import java.util.List;

@Mapper
public interface PersonnelDao {

//    查询表中所有数据
    List<Personnel> getAllPersonnel();

//    根据id查询
    Personnel getPersonnelById(int id);

//    插入一条数据
    void insertPersonnel(Personnel personnel);

//    更改
    void updatePersonnel(Personnel personnel);

//    删除
    void deletePersonnel(int id);
}
