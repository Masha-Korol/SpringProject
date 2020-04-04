package com.example.stavki.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.persistence.EntityNotFoundException;

import com.example.stavki.model.Team;
import com.example.stavki.repos.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    @Autowired
    TeamRepository teamRepository;

    public void addTeam(Team team){
        teamRepository.save(team);
    }

    public List<Team> getAll(){
        return teamRepository.findAll();
    }

    public void delete(Long id) {

    }
}
