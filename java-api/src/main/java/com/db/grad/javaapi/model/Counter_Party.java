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

    @Column(name = "name", nullable = false)
    private String name;


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

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    @Override
    public String toString() {
        return "Counter_Party{" +
                "id=" + id +
                ", bond_holder='" + bond_holder + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
