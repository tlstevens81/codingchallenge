package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Book_User;
import com.db.grad.javaapi.service.Book_UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Book_UserController {
    private Book_UserService service;

    @Autowired
    public Book_UserController(Book_UserService bus) {service = bus;}

    @PostMapping("/book_user")
    public Book_User createBook_User(@Valid@RequestBody Book_User book_user) { return service.addBook_User(book_user);}

    @GetMapping("/book_user")
    public List<Book_User> getAllBook_User() {return service.getAllBook_User();}

    @PutMapping ("/book_user/{id}")
    public ResponseEntity< Book_User > updateBook_User(@PathVariable(value = "id")Long id,@Valid@RequestBody Book_User book_userDetails) throws ResourceNotFoundException{
        final Book_User updatedBook_User = service.updateBook_UserDetails(book_userDetails);
        return ResponseEntity.ok(updatedBook_User);
    }
    @DeleteMapping("/book_user/{id}")
    public Map< String, Boolean > deleteBook_User(@PathVariable(value = "id")Long id)
        throws ResourceNotFoundException{
        boolean removed = service.removeBook_User(id);

        Map < String, Boolean > response = new HashMap<>();
        if( removed )
            response.put("deleted", Boolean.TRUE);
        else
            response.put("deleted", Boolean.FALSE);
        return response;
    }
}
