package org.example.people.service;

import org.example.people.pojo.Personnel;

import java.util.List;

public interface PersonnelService {
    List<Personnel> getAllPersonnel();
    Personnel getPersonnelById(int id);
    void savePersonnel(Personnel personnel);
    void deletePersonnel(int id);
}
