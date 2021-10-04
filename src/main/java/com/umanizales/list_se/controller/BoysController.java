package com.umanizales.list_se.controller;

import com.umanizales.list_se.controller.dto.ResponseDTO;
import com.umanizales.list_se.model.Boy;
import com.umanizales.list_se.service.ListSeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "boys")
public class BoysController {
    @Autowired
    private ListSeService listSeService;

    @PostMapping
    public ResponseEntity<ResponseDTO> addBoy(@RequestBody Boy boy) {

        return listSeService.addBoy(boy);
    }

    @PostMapping(path = "addToStart")
    public ResponseEntity<ResponseDTO> addBoyToStart(@RequestBody Boy boy) {

        return listSeService.addBoyToStart(boy);
    }

    @GetMapping
    public ResponseEntity<ResponseDTO> getBoy() {
        return listSeService.getBoy();
    }

    @GetMapping(path = "invert")
    public ResponseEntity<ResponseDTO> invertlist() {
        return listSeService.InvertList();
    }

    @PostMapping(path = "addBoys")
    public ResponseEntity<ResponseDTO> addBoys(@RequestBody List<Boy> boys) {
        for (Boy boy : boys) {
            listSeService.addBoy(boy);
        }
        return new ResponseEntity<ResponseDTO>(new ResponseDTO("satisfatorio",
                listSeService.getBoy(), null), HttpStatus.OK);
    }


    @GetMapping(path = "count")
    public ResponseEntity<ResponseDTO> count() {
        return listSeService.count();
    }

    @GetMapping(path = "getcount")
    public ResponseEntity<ResponseDTO> getcount() {
        return listSeService.getcount();
    }

    @GetMapping
    public ResponseEntity<ResponseDTO> freeBoy() {
        return listSeService.freeBoy();
    }
//@GetMapping
    // public ResponseEntity<ResponseDTO> firstmean(){
    //    return listSeService.firstmean();
//}
}


