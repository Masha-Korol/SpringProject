package com.example.stavki.controllers;

import java.util.List;
import java.util.stream.Collectors;

// tag::hateoas-imports[]
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import com.example.stavki.entities.Game;
import com.example.stavki.repos.GameRepository;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
// end::hateoas-imports[]

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    private final GameRepository repository;

    GameController(GameRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/games")
    CollectionModel<EntityModel<Game>> all() {

        List<EntityModel<Game>> games = repository.findAll().stream()
                .map(game -> new EntityModel<>(game,
                        linkTo(methodOn(GameController.class).one(game.getId())).withSelfRel(),
                        linkTo(methodOn(GameController.class).all()).withRel("games")))
                .collect(Collectors.toList());

        return new CollectionModel<>(games,
                linkTo(methodOn(GameController.class).all()).withSelfRel());
    }


    @PostMapping("/games")
    Game newGame(@RequestBody Game newGame) {
        return repository.save(newGame);
    }


    @GetMapping("/games/{id}")
    EntityModel<Game> one(@PathVariable Long id) {

        Game game = repository.findById(id)
                .orElseThrow(() -> new GameNotFoundException(id));

        return new EntityModel<>(game,
                linkTo(methodOn(GameController.class).one(id)).withSelfRel(),
                linkTo(methodOn(GameController.class).all()).withRel("games"));
    }


    @PutMapping("/games/{id}")
    Game replaceGame(@RequestBody Game newGame, @PathVariable Long id) {

        return repository.findById(id)
                .map(game -> {
                    game.setFirstTeamWinning(newGame.isFirstTeamWinning());
                    game.setRate(newGame.getRate());
                    game.setStatus(newGame.getStatus());
                    game.setDeadline(newGame.getDeadline());
                    game.setTeam1(newGame.getTeam1());
                    game.setTeam2(newGame.getTeam2());

                    return repository.save(game);
                })
                .orElseGet(() -> {
                    newGame.setId(id);
                    return repository.save(newGame);
                });
    }

    @DeleteMapping("/games/{id}")
    void deleteGame(@PathVariable Long id) {
        repository.deleteById(id);
    }
}