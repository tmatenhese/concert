package com.dev.concert.controller;

import com.dev.concert.model.Concert;
import com.dev.concert.service.impl.ConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ConcertController {

    private ConcertService concertService;

    private ConcertController(ConcertService concertService){
        this.concertService = concertService;
    }
    @GetMapping("/concerts")
    public ResponseEntity<List<Concert>> getListOfConcerts(){
        return ResponseEntity.status(HttpStatus.OK).body(concertService.getListOfConcerts());
    }
}
