package com.example.stavki.controllers;

import java.util.List;
import java.util.stream.Collectors;

// tag::hateoas-imports[]
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import com.example.stavki.repos.ManagerRepository;
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
public class ManagerController {

    private final ManagerRepository repository;

    ManagerController(ManagerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/managers")
    CollectionModel<EntityModel<Manager>> all() {

        List<EntityModel<Manager>> managers = repository.findAll().stream()
                .map(manager -> new EntityModel<>(manager,
                        linkTo(methodOn(ManagerController.class).one(manager.getId())).withSelfRel(),
                        linkTo(methodOn(ManagerController.class).all()).withRel("managers")))
                .collect(Collectors.toList());

        return new CollectionModel<>(managers,
                linkTo(methodOn(ManagerController.class).all()).withSelfRel());
    }


    @PostMapping("/managers")
    Manager newManager(@RequestBody Manager newManager) {
        return repository.save(newManager);
    }


    @GetMapping("/managers/{id}")
    EntityModel<Manager> one(@PathVariable Long id) {

        Manager manager = repository.findById(id)
                .orElseThrow(() -> new ManagerNotFoundException(id));

        return new EntityModel<>(manager,
                linkTo(methodOn(ManagerController.class).one(id)).withSelfRel(),
                linkTo(methodOn(ManagerController.class).all()).withRel("managers"));
    }


    @PutMapping("/managers/{id}")
    Manager replaceManager(@RequestBody Manager newManager, @PathVariable Long id) {

        return repository.findById(id)
                .map(manager -> {
                    manager.setMoney(newManager.getMoney());
                    manager.setName(newManager.getName());

                    return repository.save(manager);
                })
                .orElseGet(() -> {
                    newManager.setId(id);
                    return repository.save(newManager);
                });
    }

    @DeleteMapping("/managers/{id}")
    void deleteManager(@PathVariable Long id) {
        repository.deleteById(id);
    }
}