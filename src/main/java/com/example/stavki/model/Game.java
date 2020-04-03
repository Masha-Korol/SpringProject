package com.example.stavki.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.annotation.Generated;
import javax.persistence.*;

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
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "TEAM_1", nullable = false)
    private Team team1;

    @ApiModelProperty
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "TEAM_2", nullable = false)
    private Team team2;

    @ApiModelProperty
    @Column(name = "RATE")
    private double rate;

    @ApiModelProperty
    @Column(name = "RESULT")
    private int result;

}

