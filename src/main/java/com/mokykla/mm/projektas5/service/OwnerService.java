package com.mokykla.mm.projektas5.service;

import com.mokykla.mm.projektas5.dao.OwnerDAO;
import com.mokykla.mm.projektas5.models.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.validation.Valid;

@Service
public class OwnerService {

    private OwnerDAO ownerDAO;

    @Autowired
    public OwnerService(OwnerDAO ownerDAO) {

        this.ownerDAO = ownerDAO;
    }

    public Iterable <Owner> getOwners(){

        return ownerDAO.findAll();
    }

    public void addOwners(@Valid Owner owner){

      ownerDAO.save(owner);
    }
}
