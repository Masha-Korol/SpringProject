package com.example.stavki.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Wager {
    @ForeignKey
    private Stake stakeFK;


}
