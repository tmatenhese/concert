package com.dev.concert.service;

import com.dev.concert.model.Concert;
import com.dev.concert.repository.ConcertRepository;
import com.dev.concert.service.impl.ConcertService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ConcertServiceUTest {
    @InjectMocks
    private ConcertService concertService;
    @Mock
    private ConcertRepository concertRepository;

    @Test
    void whenAConcertIsAdded_ShouldRetrieveTheNumberOfAddedConcerts() {
        Map<Integer, Concert> concertMap = new HashMap<>();
        concertMap.put(1,new Concert(1,"artist","artist"));
        when(concertRepository.getConcertMap()).thenReturn(concertMap);
        assertThat(concertService.getListOfConcerts(), hasSize(1));
        verify(concertRepository, times(1)).getConcertMap();
    }

    @Test
    void whenNoConcertsExist_ShouldReturnEmptyList() {
        when(concertRepository.getConcertMap()).thenReturn(new HashMap<>());
        assertThat(concertService.getListOfConcerts(), hasSize(0));
        verify(concertRepository, times(1)).getConcertMap();
    }

}
