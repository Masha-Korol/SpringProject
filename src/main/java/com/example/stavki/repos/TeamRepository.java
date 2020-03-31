package com.example.stavki.repos;

import com.example.stavki.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, String> {

}
