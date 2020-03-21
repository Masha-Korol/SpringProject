package com.example.stavki.repos;

import com.example.stavki.entities.Wager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WagerRepository extends JpaRepository<Wager, Long> {
}
