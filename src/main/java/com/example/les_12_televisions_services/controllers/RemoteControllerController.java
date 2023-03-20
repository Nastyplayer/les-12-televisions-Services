package com.example.les_12_televisions_services.controllers;

import com.example.les_12_televisions_services.service.CiModuleService;
import com.example.les_12_televisions_services.service.RemoteControllerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RequestMapping("remoteControllers")
@RestController
public class RemoteControllerController {

    // constructor injeccion
    private final RemoteControllerService remoteControllerService;

    public RemoteControllerController(RemoteControllerService remoteControllerService) {

        this.remoteControllerService = remoteControllerService;
    }

}
