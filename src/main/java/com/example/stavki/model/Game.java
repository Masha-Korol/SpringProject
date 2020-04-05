package com.example.stavki.model;

import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "games")
public class Game{

    @Id
    @Column(name = "game_id")
    private int game_id;

    private Status status;

    private Date deadline;

    //связь две команды - игра

    @Column(name = "rate")
    private double rate;

    @Column(name = "result")
    private Integer result;

    public int getId() {
        return game_id;
    }

    public void setId(int id) {
        this.game_id = id;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
































/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.annotation.Generated;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import java.util.Date;
import java.util.List;
import com.example.stavki.model.Team;

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

    /*
    @ApiModelProperty
    @Column(name = "STATUS")
    private Status status;*/

    /*
    @ApiModelProperty
    @Column(name = "DEADLINE")
    private Date deadline;*/

    /*
    @ApiModelProperty
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "TEAM_1", nullable = false)
    private Team team1;

    @ApiModelProperty
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "TEAM_2", nullable = false)
    private Team team2;*/

    /*//@ApiModelProperty
    @ManyToMany
    @JoinTable(
            name = "previousGames",
            JoinColumns=@JoinColumn(name = "team1"),
            inverseJoinColumns=@JoinColumn(name = "team2")
    )
    private List<Team> duo;*/

    /*
    @ApiModelProperty
    @Column(name = "RATE")
    private double rate;

    @ApiModelProperty
    @Column(name = "RESULT")
    private int result;

}*/

