package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Book_User;
import com.db.grad.javaapi.repository.Book_UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class Book_UserServiceTest {
    @Mock
    private Book_UserRepository repo;

    @InjectMocks
    private Book_UserService cut;

    @Test
    public void add_a_book_user_return_number_of_book_user_in_repo()
    {
        Book_User book_user = new Book_User();
        book_user.setUsers_id(2L);
        book_user.setBook_id(2L);
        Mockito.lenient().when(repo.save(book_user)).thenReturn(book_user);
        Mockito.lenient().when(repo.count()).thenReturn(2L);
        cut.addBook_User( book_user );
        System.out.println( book_user );
        System.out.println(cut.getNoOfBook_User());
        int expectedResult = 2;

        long actualResult = cut.getNoOfBook_User();

        assertEquals( expectedResult, actualResult);
    }
}
