package com.db.grad.javaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "Book_User")
public class Book_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long users_id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long book_id;

    public long getBook_id() {
        return book_id;
    }

    public void setBook_id(long book_id) {
        this.book_id = book_id;
    }

    public long getUsers_id() {
        return users_id;
    }

    public void setUsers_id(long users_id) {
        this.users_id = users_id;
    }

    @Override
    public String toString() {
        return "Book_User{" +
                "users_id=" + users_id +
                ", book_id=" + book_id +
                '}';
    }
}

