package com.mokykla.mm.projektas5.dao;

import com.mokykla.mm.projektas5.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository <User, Long> {

}
