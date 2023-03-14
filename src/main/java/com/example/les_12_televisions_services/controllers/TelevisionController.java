package com.example.les_12_televisions_services.controllers;



import com.example.les_12_televisions_services.dto.TelevisionInputDto;
import com.example.les_12_televisions_services.dto.TelevisionOutputDto;
import com.example.les_12_televisions_services.exceptions.RecordNotFoundException;
import com.example.les_12_televisions_services.module.Television;
import com.example.les_12_televisions_services.service.TelevisionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RequestMapping("televisions")
@RestController
public class TelevisionController {

    // constructor injeccion
    private final TelevisionService televisionService;

    public TelevisionController(TelevisionService televisionService) {

        this.televisionService = televisionService;
    }


    // @Autowired
    // TelevisionRepository repo;
    //  public static final List<String> televisionDatabase = new ArrayList<>();



    //  @GetMapping("televisions")
    //  public ResponseEntity<Object> getTelevisions() {
    //  return ResponseEntity.ok(TelevisionService.class);
    // }
///////////////////////////////////////////////////////////////////////
    @GetMapping()
    public ResponseEntity<List<TelevisionOutputDto>> getAllTelevisions() {
        List<TelevisionOutputDto>TelevisionOutput = televisionService.getAllTelevisions();
        return ResponseEntity.ok(TelevisionOutput);
    }


    //////////////////////////////////////////////////////////////////////////
    @GetMapping("/{id}")
    public ResponseEntity<TelevisionOutputDto> getTelevisions(@PathVariable long id) {
        //  if (id < televisions.size()) {

        //   if (id < 10) {
        TelevisionOutputDto televisionOutputDto = televisionService.getTelevisionById(id);


        //  return new ResponseEntity<>("Televisions:  " + id + "!", HttpStatus.OK);
        //   } else {
        //      throw new RecordNotFoundException("id not found");
        return ResponseEntity.ok().body(televisionOutputDto);
    }

//////////////////////////////////////////////////////////////////////////

    @PostMapping("")
    public ResponseEntity<TelevisionOutputDto>createTelevision(@RequestBody TelevisionInputDto televisionInputDto) {
        // public ResponseEntity<TelevisionOutputDto> addTelevision(@Valid @RequestBody
        //   TelevisionInputDto televisionInputDto) {


        TelevisionOutputDto tdto = televisionService.createTelevision(televisionInputDto);
        URI uri = URI.create(
                ServletUriComponentsBuilder.fromCurrentContextPath().path("/televisions/" +tdto).toUriString());
        //Object televisions = null;
        // Television.add(television);
        return ResponseEntity.created(uri).body(tdto);
        // TelevisionOutputDto tdto = televisionService.addTelevision(televisionInputDto);
        //  return ResponseEntity.created(URI.create("Television")).body(tdto);

    }



    //////////////////////////////////////////////////////////////////////////////////
    @DeleteMapping("/{id}")
    public ResponseEntity<TelevisionOutputDto> deleteById(@PathVariable Long id) {
        TelevisionService.deleteById(id);
        return ResponseEntity.noContent().build();

    }


    ///////////////////////////////////////////////////////////////////////////////////
    @DeleteMapping("/delete/{name}")
    public ResponseEntity<TelevisionOutputDto> deleteByName(@PathVariable String name) {
        TelevisionService.deleteByName(name);
        return ResponseEntity.noContent().build();
    }


    //////////////////////////////////////////////////////////////////////////////////
    @PutMapping("/{id}")

    public ResponseEntity<TelevisionOutputDto> updateTelevision(@PathVariable Long id,
                                                                @RequestBody TelevisionInputDto newTelevision) {


        TelevisionOutputDto tdto = televisionService.updateTelevision(id,  newTelevision);

        return ResponseEntity.ok().body(tdto);




        // @RequestBody String television) {

        //   if (id >= 0 && id < television.size() ) {
        //     Television.set(id, television);


        //    return ResponseEntity.noContent().build();
        //    } else {
        ///       throw new RecordNotFoundException("no found", HttpStatus.NOT_FOUND);
    }}




