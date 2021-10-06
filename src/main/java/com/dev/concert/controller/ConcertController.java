package com.dev.concert.controller;

import com.dev.concert.model.Concert;
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

    @GetMapping("/concerts")
    public ResponseEntity<List<Concert>> getListOfConcerts(){
        List<Concert> concertList = new ArrayList<>();
        concertList.add(new Concert(1,"artist1","venue1"));
        return ResponseEntity.status(HttpStatus.OK).body(concertList);
    }
}
