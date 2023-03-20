package com.example.les_12_televisions_services.service;


import com.example.les_12_televisions_services.repository.RemoteControllerRepository;
//import com.example.les_12_televisions_services.repository.WallBracketRepository;
import org.springframework.stereotype.Service;




    @Service
    public class RemoteControllerService {
        private static RemoteControllerRepository repos = null;

        public RemoteControllerService(RemoteControllerRepository repos ) {

            this.repos = repos;
        }
    }





