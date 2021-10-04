package com.umanizales.list_se.service;

import com.umanizales.list_se.controller.dto.ResponseDTO;
import com.umanizales.list_se.model.Boy;
import com.umanizales.list_se.model.ListSE;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ListSeService {
    private ListSE listBoys;

    public ListSeService() {
        listBoys = new ListSE();
    }

    public ResponseEntity<ResponseDTO> addBoy(Boy boy) {
        listBoys.add(boy);
        return new ResponseEntity<>(new ResponseDTO("Nino Adicionado", true, null),
                HttpStatus.OK);
    }

    public ResponseEntity<ResponseDTO> addBoyToStart(Boy boy) {
        listBoys.addToStart(boy);
        return new ResponseEntity<>(new ResponseDTO("Nino Adicionado", true, null),
                HttpStatus.OK);
    }

    public ResponseEntity<ResponseDTO> getBoy() {
        return new ResponseEntity<>(
                new ResponseDTO("Satisfactorio", listBoys.getHead(), null), HttpStatus.OK);
    }

    public ResponseEntity<ResponseDTO> InvertList() {
        listBoys.invert();
        return new ResponseEntity<>(new ResponseDTO("Satisfactorio", listBoys.getHead(), null),
                HttpStatus.OK);
    }

    public ResponseEntity<ResponseDTO> count() {
        return new ResponseEntity<>(
                new ResponseDTO("Satisfactorio", listBoys.count(), null), HttpStatus.OK);
    }

    public ResponseEntity<ResponseDTO> getcount() {
        return new ResponseEntity<>(
                new ResponseDTO("Satisfactorio", listBoys.getCount(), null), HttpStatus.OK);
    }

    public ResponseEntity<ResponseDTO> freeBoy() {
        return new ResponseEntity<>(
                new ResponseDTO("Satisfactorio", listBoys.list(), null), HttpStatus.OK);
    }

    // public ResponseEntity<ResponseDTO> firstmean() {
    //     return new ResponseEntity<>(
    //             new ResponseDTO("Satisfactorio", true, null), HttpStatus.OK);
    //   }

    //  public ResponseEntity<ResponseDTO> delete() {
    //    listBoys.delete();
    //    return new ResponseEntity<>(
    //           new ResponseDTO("Satisfactorio", listBoys.delete(), null),HttpStatus.OK);

    // }


}
