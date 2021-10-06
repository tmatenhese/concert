package com.dev.concert.service.impl;

import com.dev.concert.model.Concert;
import com.dev.concert.repository.ConcertRepository;
import com.dev.concert.service.IConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ConcertService implements IConcertService {
    private ConcertRepository concertRepository;
    public ConcertService(ConcertRepository concertRepository){
        this.concertRepository = concertRepository;
    }

    @Override
    public List<Concert> getListOfConcerts() {
        Map<Integer,Concert> concertMap = concertRepository.getConcertMap();
        return new ArrayList<>(concertMap.values());
    }
}
