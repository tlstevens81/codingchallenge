package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Counter_Party;
import com.db.grad.javaapi.repository.Counter_PartyRepository;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class Counter_PartyServiceTest {
    @Mock
    private Counter_PartyRepository repo;

    @InjectMocks
    private Counter_PartyService cut;

    @Test
    public void add_a_counter_party_return_number_of_counter_party_in_repo() {

        //arrange
        Counter_Party counter_party = new Counter_Party();

        counter_party.setBond_holder("Zurich Pension fund 4");
        counter_party.setId(3);
        Mockito.lenient().when(repo.save(Mockito.any())).thenReturn(new Counter_Party());
        Mockito.lenient().when(repo.count()).thenReturn(2L);
        cut.addCounter_Party(counter_party);
        System.out.println(counter_party);
        System.out.println(cut.getNoOfCounter_Party());
        int expectedResult = 2;

        long actualResult = cut.getNoOfCounter_Party();

        assertEquals(expectedResult, actualResult);

    }
}


