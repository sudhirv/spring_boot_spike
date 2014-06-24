package com.thoughtworks.spike.controllers;

import com.thoughtworks.spike.viewmodels.ApplicationDetails;
import com.thoughtworks.spike.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApplicationController {

    private final ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @RequestMapping(value = "/application/{id}", method= RequestMethod.GET)
    @ResponseBody
    ApplicationDetails show(@PathVariable("id") long id){
        return new ApplicationDetails(applicationService.findApplicationById(id));
    }
}
