package com.mokykla.mm.projektas5.controllers;

import com.mokykla.mm.projektas5.models.Worker;
import com.mokykla.mm.projektas5.service.WorkerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@Controller
@Api(value = "worker")
@RequestMapping(value = "/worker")
public class WorkerController {

    private final WorkerService workerService;

    @Autowired
    public WorkerController(WorkerService workerService) {

        this.workerService = workerService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Isrinkt darbuotojus", notes = "Rodo registruotus darbuotojus.")
    public Iterable<Worker> getWorkers() {

        return workerService.getWorkers();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Prideda darbuotojus", notes = "Prideda registruotus darbuotojus.")
    @ResponseStatus(HttpStatus.CREATED)

    public void addWorkers (@RequestBody @Valid final Worker createWorkerCommand) {

        workerService.addWorkers(createWorkerCommand);
    }

}
