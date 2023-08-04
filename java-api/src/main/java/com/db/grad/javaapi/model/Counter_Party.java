package com.db.grad.javaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "Counter_Party")
public class Counter_Party {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "bond_holder", nullable = false)
    private String bond_holder;


    public long getId() {
        return id;
    }

    public void setId(long id) {this.id = id;}

    public String getBond_holder() {
        return bond_holder;
    }

    public void setBond_holder(String bond_holder) {
        this.bond_holder = bond_holder;
    }

    @Override
    public String toString() {
        return "Counter_Party{" +
                "id=" + id +
                ", bond_holder='" + bond_holder + '\'' +
                '}';
    }
}
