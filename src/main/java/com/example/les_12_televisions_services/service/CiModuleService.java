package com.example.les_12_televisions_services.service;

import com.example.les_12_televisions_services.repository.CiModuleRepository;
import com.example.les_12_televisions_services.repository.TelevisionRepository;
import org.springframework.stereotype.Service;


@Service
public class CiModuleService {

    private static CiModuleRepository repos = null;

    // constructor injection (instead of @Autowired)
    public CiModuleService(CiModuleRepository repos) {

        this.repos = repos;
    }
}