package org.example.people.service.impl;

import org.example.people.dao.PersonnelDao;
import org.example.people.pojo.Personnel;
import org.example.people.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelServiceImpl implements PersonnelService {

    @Autowired
    private PersonnelDao personnelDao;

    @Override
    public List<Personnel> getAllPersonnel() {
        return personnelDao.getAllPersonnel();
    }

    @Override
    public Personnel getPersonnelById(int id) {
        return personnelDao.getPersonnelById(id);
    }

    @Override
    public void savePersonnel(Personnel personnel) {
        if (personnel.getId() == 0) {
            personnelDao.insertPersonnel(personnel);
        } else {
            personnelDao.updatePersonnel(personnel);
        }
    }

    @Override
    public void deletePersonnel(int id) {
        personnelDao.deletePersonnel(id);
    }
}
