package org.example.people.service;

import org.example.people.pojo.User;

public interface UserService {
    User getByUsername(String username);

}
