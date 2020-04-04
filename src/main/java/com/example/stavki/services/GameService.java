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
import com.example.stavki.repos.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    public void addClient(Game game){
        gameRepository.save(game);
    }

    public List<Game> getAll(){
        return gameRepository.findAll();
    }

    public void addGame(Game newGame) {

    }

    public void delete(Long id) {

    }
}
