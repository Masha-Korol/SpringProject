package com.example.stavki.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.annotation.Generated;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import java.util.List;

@ApiModel
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TEAMS")
public class Team {

    @ApiModelProperty
    @Id
    @Column(name = "ID", unique = true, nullable = false, updatable = false)
    private String name;

    @ApiModelProperty
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "team")
    private List<Game> previousGames;

    @ApiModelProperty
    @Column(name = "WINNING_RATE")
    private float winningRate;
}
