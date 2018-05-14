package com.mokykla.mm.projektas5.service;

import com.mokykla.mm.projektas5.dao.UserDAO;
import com.mokykla.mm.projektas5.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class UserService {

    private UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {

        this.userDAO = userDAO;
    }

    public Iterable<User> getUsers(){

        return userDAO.findAll();
    }

    public void addUsers (@Valid User user){

        userDAO.save(user);
    }
}
