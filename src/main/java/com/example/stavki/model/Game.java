package com.example.stavki.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import java.util.Date;

@ApiModel
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "GAMES")
public class Game {

    @ApiModelProperty
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false, updatable = false)
    private int id;

    @ApiModelProperty
    @Column(name = "STATUS")
    private Status status;

    @ApiModelProperty
    @Column(name = "DEADLINE")
    private Date deadline;

    @ApiModelProperty
    @Column(name = "TEAM1")
    private String team1;

    @ApiModelProperty
    @Column(name = "TEAM2")
    private String team2;

    @ApiModelProperty
    @Column(name = "RATE")
    private double rate;

    @ApiModelProperty
    @Column(name = "IF_FIRST_TEAM_WON")
    private boolean isFirstTeamWinning;

}

