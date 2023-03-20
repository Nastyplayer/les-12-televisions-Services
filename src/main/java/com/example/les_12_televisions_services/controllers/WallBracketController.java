package com.example.les_12_televisions_services.controllers;

import com.example.les_12_televisions_services.service.CiModuleService;
import com.example.les_12_televisions_services.service.WallBracketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("wallBracketControllers")
@RestController
public class WallBracketController {

    // constructor injeccion
    private final WallBracketService wallBracketService;

    public WallBracketController(WallBracketService wallBracketService) {

        this.wallBracketService = wallBracketService;
    }


}