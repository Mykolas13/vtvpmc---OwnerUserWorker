package com.mokykla.mm.projektas5.controllers;

import com.mokykla.mm.projektas5.models.Owner;
import com.mokykla.mm.projektas5.service.OwnerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@Controller
@Api(value = "owner")
@RequestMapping(value = "/owner")
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {

        this.ownerService = ownerService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Isrinkt savininkus", notes = "Rodo registruotus savininkus.")
    public Iterable<Owner> getOwners() {

        return ownerService.getOwners();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Prideda savininkus", notes = "Prideda registruotus savininkus.")
    @ResponseStatus(HttpStatus.CREATED)

    public void addOwners (@RequestBody @Valid final Owner createOwnerCommand) {

        ownerService.addOwners(createOwnerCommand);
    }

}
