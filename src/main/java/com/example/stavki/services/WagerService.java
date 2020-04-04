package com.example.stavki.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.persistence.EntityNotFoundException;

import com.example.stavki.model.Wager;
import com.example.stavki.repos.WagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WagerService {
    @Autowired
    WagerRepository wagerRepository;

    public void addWager(Wager wager){
        wagerRepository.save(wager);
    }

    public List<Wager> getAll(){
        return wagerRepository.findAll();
    }

    public void delete(Long id) {
        
    }
}
