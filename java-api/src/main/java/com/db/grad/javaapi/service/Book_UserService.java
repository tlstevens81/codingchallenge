package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Book_User;
import com.db.grad.javaapi.repository.Book_UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Book_UserService {
    private Book_UserRepository book_userRepository;

    @Autowired
    public Book_UserService(Book_UserRepository book_userRepo) {book_userRepository = book_userRepo;}

    public long getNoOfBook_User() {return book_userRepository.count();}

    public List<Book_User> getAllBook_User() {return book_userRepository.findAll();}

    public Book_User updateBook_UserDetails(Book_User book_userToUpdate) {return book_userRepository.save( book_userToUpdate );}

public boolean removeBook_User(long book_id)
{
  boolean result = false;
Optional<Book_User> theBook_User = book_userRepository.findById(book_id);
if(theBook_User.isPresent())
{
book_userRepository.delete(theBook_User.get());
result = true;
}
return result;
}

    public Book_User addBook_User(Book_User bookUser) {
        return bookUser;
    }
}
