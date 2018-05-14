package com.mokykla.mm.projektas5.dao;

import com.mokykla.mm.projektas5.models.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerDAO extends CrudRepository <Owner, Long> {

}
