package com.dev.concert.controller;

import com.dev.concert.repository.ConcertRepository;
import com.dev.concert.service.impl.ConcertService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = ConcertController.class)
public class ConcertControllerITest {
    @Autowired
    MockMvc mockMvc;
    @MockBean
    private ConcertService concertService;
    @MockBean
    private ConcertRepository concertRepository;
    @Test
    void getListOfConcerts() throws Exception {
        mockMvc.perform(get("/api/concerts"))
                .andExpect(status().is2xxSuccessful());
    }
}
