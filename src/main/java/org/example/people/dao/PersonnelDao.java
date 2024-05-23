package org.example.people.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.people.pojo.Personnel;

import java.util.List;

@Mapper
public interface PersonnelDao {
    List<Personnel> getAllPersonnel();
    Personnel getPersonnelById(int id);
    void insertPersonnel(Personnel personnel);
    void updatePersonnel(Personnel personnel);
    void deletePersonnel(int id);
}
