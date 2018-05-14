package com.mokykla.mm.projektas5.dao;

import com.mokykla.mm.projektas5.models.Worker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerDAO extends CrudRepository <Worker, Long> {

}
