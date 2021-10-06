package com.dev.concert.repository;

import com.dev.concert.model.Concert;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ConcertRepository {
    private Map<Integer,Concert> concertMap = new HashMap<>();

    public Map<Integer, Concert> getConcertMap() {
        return concertMap;
    }

    public void setConcertMap(Map<Integer, Concert> concertMap) {
        this.concertMap = concertMap;
    }
}
