package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Counter_Party;
import com.db.grad.javaapi.service.Counter_PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Counter_PartyController {
    private Counter_PartyService service;

    @Autowired
    public Counter_PartyController(Counter_PartyService cps) {service = cps;}

    @PostMapping("/counter_party")
    public Counter_Party createCounter_Party(@Valid@RequestBody Counter_Party counter_party) {return service.addCounter_Party(counter_party);}

    @GetMapping("/counter_party")
    public List<Counter_Party> getAllCounter_Party() {return service.getAllCounter_Party();}

    @PutMapping ("/counter_party/{id}")
    public ResponseEntity< Counter_Party > updateCounter_Party(@PathVariable(value = "id")Long id,@Valid@RequestBody Counter_Party counter_partyDetails) throws ResourceNotFoundException{
        final Counter_Party updatedCounter_Party = service.updateCounter_PartyDetails(counter_partyDetails);
        return ResponseEntity.ok(updatedCounter_Party);
    }
    @DeleteMapping("/counter_party/{id}")
    public Map< String, Boolean > deleteCounter_Party(@PathVariable(value = "id")Long id)
        throws ResourceNotFoundException{
        boolean removed = service.removeCounter_Party(id);

        Map <String, Boolean > response = new HashMap<>();
        if( removed )
            response.put("deleted", Boolean.TRUE);
        else
            response.put("deleted", Boolean.FALSE);
        return response;
    }
}
