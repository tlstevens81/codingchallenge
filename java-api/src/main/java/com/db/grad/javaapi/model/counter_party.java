package com.db.grad.javaapi.model;


import javax.persistence.*;

@Entity
@Table(name = "counter_party")
public class Book_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "bond_holder",nullable = false)
    private String bond_holder

    public long getId() {
        return id;
    }

    public long SetId(long id) {this.id = id;}

    public String getBond_holder() {
        return bond_holder;
    }

    public void setBond_holder(String bond_holder) {
        this.name = bond_holder;
    }
    @Override
    public String toString() {
        return "counter_party{" +
                ", id='" + id + '\'' +
                ", bond_holder='" + bond_holder + '\'' +
    }';
}
}