package com.example.les_12_televisions_services.service;


//import com.example.les_12_televisions_services.repository.TelevisionRepository;
import com.example.les_12_televisions_services.repository.WallBracketRepository;
import org.springframework.stereotype.Service;

@Service
public class WallBracketService {
    private static WallBracketRepository repos = null;

    public WallBracketService(WallBracketRepository repos ) {

        this.repos = repos;
    }
}
