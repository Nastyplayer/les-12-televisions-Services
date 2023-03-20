package com.example.les_12_televisions_services.controllers;

import com.example.les_12_televisions_services.service.CiModuleService;

import org.springframework.web.bind.annotation.*;


@RequestMapping("ciModuleControllers")
@RestController
public class CiModuleController {

    // constructor injeccion
    private final CiModuleService ciModuleService;

    public CiModuleController(CiModuleService ciModuleService) {

        this.ciModuleService = ciModuleService;
    }


}