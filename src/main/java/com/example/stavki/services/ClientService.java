package com.example.stavki.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.persistence.EntityNotFoundException;

import com.example.stavki.model.Client;
import com.example.stavki.repos.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public void addClient(Client client){
        clientRepository.save(client);
    }

    public List<Client> getAll(){
        return clientRepository.findAll();
    }

    public void bet(){
        //Логика
    }

    public void addMoney(){
        //Логика
    }

    public void delete(Long id) {

    }
}
