package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Counter_Party;
import com.db.grad.javaapi.repository.Counter_PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Counter_PartyService {
    private Counter_PartyRepository counter_partyRepository;

    @Autowired
    public Counter_PartyService(Counter_PartyRepository counter_partyRepo) {counter_partyRepository = counter_partyRepo;}

    public Counter_Party addCounter_Party(Counter_Party counter_party) {return counter_partyRepository.save(counter_party);}

    public long getNoOfCounter_Party() {return counter_partyRepository.count();}

    public List<Counter_Party> getAllCounter_Party() {return counter_partyRepository.findAll();}

    public Counter_Party updateCounter_PartyDetails(Counter_Party counter_partyToUpdate) {return counter_partyRepository.save( counter_partyToUpdate );}

    public boolean removeCounter_Party(long id) {
        boolean result = false;

        Optional<Counter_Party> theCounter_Party = counter_partyRepository.findById(id);
        if (theCounter_Party.isPresent()) {
            counter_partyRepository.delete(theCounter_Party.get());
            result = true;
        }
        return result;


    }
}
