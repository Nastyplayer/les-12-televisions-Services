package com.example.les_12_televisions_services.service;


import com.example.les_12_televisions_services.dto.RemoteControllerOutputDto;
import com.example.les_12_televisions_services.module.RemoteController;
import com.example.les_12_televisions_services.repository.RemoteControllerRepository;
//import com.example.les_12_televisions_services.repository.WallBracketRepository;
import org.springframework.stereotype.Service;




    @Service
    public class RemoteControllerService {
        private static RemoteControllerRepository repos = null;

        public RemoteControllerService(RemoteControllerRepository repos ) {

            this.repos = repos;
        }}

  //         public RemoteControllerOutputDto fromTelevision (RemoteController remoteController) {
   //             RemoteControllerOutputDto tdto = new RemoteControllerOutputDto();
   //             tdto.setId(RemoteController.getId());

  //          tdto.setCompatibleWith(RemoteController.getCompatibleWith());
 //           tdto.setBatteryType(RemoteController.getBatteryType());
 //           tdto.setName(RemoteController.getName());
  //          tdto.setBrand(RemoteController.getBrand());
   //         tdto.setPrice(RemoteController.getPrice());
   //        tdto.setTelevision(RemoteController.getTelevision());

 //           return tdto;
  //      }}






