package com.mokykla.mm.projektas5.service;

import com.mokykla.mm.projektas5.dao.WorkerDAO;
import com.mokykla.mm.projektas5.models.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.validation.Valid;

@Service
public class WorkerService {

    private WorkerDAO workerDAO;

    @Autowired
    public WorkerService(WorkerDAO workerDAO) {

        this.workerDAO = workerDAO;
    }

    public Iterable <Worker> getWorkers(){

        return workerDAO.findAll();
    }

    public void addWorkers(@Valid Worker worker){

        workerDAO.save(worker);
    }

}
