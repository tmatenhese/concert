package com.dev.concert;

import com.dev.concert.model.Concert;
import com.dev.concert.repository.ConcertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class StartUpInit {
    @Autowired
    ConcertRepository concertRepository;
    @PostConstruct
    public void init() {
        Map<Integer, Concert> concertMap = new HashMap<>();
        for (int i = 1; i < 100; i++) {
            Concert concert = new Concert(
                    i,
                    "artist" + i,
                    "venue" + i
            );
            concertMap.put(concert.getId(), concert);
        }
        concertRepository.setConcertMap(concertMap);
    }
}