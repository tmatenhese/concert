package com.dev.concert.service;

import com.dev.concert.model.Concert;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IConcertService {
    List<Concert> getListOfConcerts();
}
