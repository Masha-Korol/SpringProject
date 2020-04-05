package com.example.stavki.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {

    @Id
    Integer id;

    @Column(name = "name")
    private String name;

    public Book() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "book")
    private Set<Author> users;

    public Set<Author> getUsers() {
        return users;
    }

    public void setUsers(Set<Author> users) {
        this.users = users;
    }
}
