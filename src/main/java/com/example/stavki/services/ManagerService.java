package com.example.stavki.services;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.persistence.EntityNotFoundException;

import com.example.stavki.model.Game;
import com.example.stavki.model.Manager;
import com.example.stavki.repos.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    @Autowired
    ManagerRepository managerRepository;

    public void addClient(Manager manager){
        managerRepository.save(manager);
    }

    public List<Manager> getAll(){
        return managerRepository.findAll();
    }

    public void pay(){
        //логика
    }

    public void addGame(Game game){
        //логика
    }
}
