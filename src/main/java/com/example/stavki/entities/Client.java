package com.example.stavki.entities;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.LinkedList;
import java.util.List;

@Data
@Entity
public class Client extends User{
    private @Id @GeneratedValue Long id;
    List<Wager> current;
    List<Wager> history;

    Client(){}

    Client(String name){
        super(name);
        List<Wager> current = new LinkedList<Wager>();
        List<Wager> history = new LinkedList<Wager>();
    }

    public void bet(){
        //логика
    }
}
