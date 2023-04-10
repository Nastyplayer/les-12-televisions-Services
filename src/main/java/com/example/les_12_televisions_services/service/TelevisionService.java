package com.example.les_12_televisions_services.service;



import com.example.les_12_televisions_services.dto.IdInputDto;
import com.example.les_12_televisions_services.dto.TelevisionInputDto;
import com.example.les_12_televisions_services.dto.TelevisionOutputDto;
import com.example.les_12_televisions_services.exceptions.RecordNotFoundException;
import com.example.les_12_televisions_services.module.Television;
import com.example.les_12_televisions_services.repository.RemoteControllerRepository;
import com.example.les_12_televisions_services.repository.TelevisionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TelevisionService {

    private static TelevisionRepository repos = null;
    //  private final TelevisionRepository repos;
    private final RemoteControllerRepository remoteControllerRepository;

    // constructor injection (instead of @Autowired)
    public TelevisionService(TelevisionRepository repos, RemoteControllerRepository remoteControllerRepository) {
        this.repos = repos;
        this.remoteControllerRepository = remoteControllerRepository;
    }


    ////////////////////////////////////////////////////////////////////
    public List<TelevisionOutputDto> getAllTelevisions() {
        Iterable<Television> television = repos.findAll();
        List<TelevisionOutputDto> televisionOutputDtos = new ArrayList<>();
        for (Television t : television) {
            TelevisionOutputDto tdto = fromTelevision(t);
            televisionOutputDtos.add(tdto);

        }
        return televisionOutputDtos;
    }

////////////////////////////////////////////////////////////////////////////////


    public TelevisionOutputDto getTelevisionById(Long id) {
        Optional<Television> television = repos.findById(id);
        if (id < 10) {
            //if (television.isEmpty()) {
            Television t = television.get();
            return fromTelevision(t);

        } else {
            // Television t = television.get();
            //  TelevisionOutputDto tdto = TelevisionToDto(t);
            throw new RecordNotFoundException("id not found");

        }
    }
////////////////////////////////////////////////////////////////////////////

    public TelevisionOutputDto createTelevision(TelevisionInputDto dto) {
        // Television newTelevision = new Television();
        Television t = toTelevision(dto);
        repos.save(t);

        return fromTelevision(t);
    }


////////////////////////////////////////////////////////////


    public static TelevisionOutputDto deleteById(Long id) {

        repos.deleteById(id);
        return null;

    }

    // TelevisionInputDto dto;
    //  televisionOutputDto tdto = (televisionOutputDto) toTelevision(dto);
    //TelevisionOutputDto toTelevision = null;

    // repos.save(t);


///////////////////////////////////////////////////////////////////

    public static TelevisionOutputDto deleteByName(String name) {
        repos.deleteByName(name);
        return null;
    }


///////////////////////////////////////////////////////////////////////////////////////

    public TelevisionOutputDto updateTelevision(Long id, TelevisionInputDto newTelevision) {


        Optional<Television> televisionOptional = repos.findById(id);
        if (televisionOptional.isPresent()) {

            Television television = televisionOptional.get();


            television.setAmbiLight(newTelevision.getAmbiLight());
            television.setAvailableSize(newTelevision.getAvailableSize());
            television.setAmbiLight(newTelevision.getAmbiLight());
            television.setBluetooth(newTelevision.getBluetooth());
            television.setBrand(newTelevision.getBrand());
            television.setHdr(newTelevision.getHdr());
            television.setName(newTelevision.getName());
            television.setOriginalStock(newTelevision.getOriginalStock());
            television.setPrice(newTelevision.getPrice());
            television.setRefreshRate(newTelevision.getRefreshRate());
            television.setScreenQuality(newTelevision.getScreenQuality());
            television.setScreenType(newTelevision.getScreenType());
            television.setSmartTv(newTelevision.getSmartTv());
            television.setSold(newTelevision.getSold());
            television.setType(newTelevision.getType());
            television.setVoiceControl(newTelevision.getVoiceControl());
            television.setWifi(newTelevision.getWifi());
            Television returnTelevision = repos.save(television);

            return fromTelevision(returnTelevision);

        } else {

            throw new RecordNotFoundException("television not found");

        }
    }


    public Television toTelevision(TelevisionInputDto dto) {

        var television = new Television();

        television.setType(dto.getType());
        television.setBrand(dto.getBrand());
        television.setName(dto.getName());
        television.setPrice(dto.getPrice());
        television.setAvailableSize(dto.getAvailableSize());
        television.setRefreshRate(dto.getRefreshRate());
        television.setScreenType(dto.getScreenType());
        television.setScreenQuality(dto.getScreenQuality());
        television.setSmartTv(dto.getSmartTv());
        television.setWifi(dto.getWifi());
        television.setVoiceControl(dto.getVoiceControl());
        television.setHdr(dto.getHdr());
        television.setBluetooth(dto.getBluetooth());
        television.setAmbiLight(dto.getAmbiLight());
        television.setOriginalStock(dto.getOriginalStock());
        television.setSold(dto.getSold());

        return television;
    }


    public TelevisionOutputDto fromTelevision(Television t) {
        TelevisionOutputDto tdto = new TelevisionOutputDto();

        tdto.id = t.getId();
        tdto.brand = t.getBrand();
        tdto.type = t.getType();
        tdto.name = t.getName();
        tdto.price = t.getPrice();
        tdto.availableSize = t.getAvailableSize();
        tdto.refreshRate = t.getRefreshRate();
        tdto.screenType = t.getScreenType();
        tdto.screenQuality = t.getScreenQuality();
        tdto.smartTv = t.getSmartTv();
        tdto.wifi = t.getWifi();
        tdto.hdr = t.getHdr();
        tdto.bluetooth = t.getBluetooth();
        tdto.ambiLight = t.getAmbiLight();
        tdto.originalStock = t.getOriginalStock();
        tdto.sold = t.getSold();
        return tdto;

    }


}





// public TelevisionDto getTelevision(long id) {


//   if (TelevisionFound == null) {
//     throw new IndexOutOfBoundsException("Cannot find Television");
//   } else if (!repos.existsById(id)) {
//      throw new RecordNotFoundException("No television found with this ID");
//  } else {
// /     Optional<Television> TelevisionFound = repos.findById(id);
//     TelevisionDto TelevisionFound = new TelevisionDto();
//    return TelevisionFound;
// }





