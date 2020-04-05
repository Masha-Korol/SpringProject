package com.example.stavki.model;

//import jdk.internal.vm.annotation.Stable;

import javax.persistence.*;

@Entity
@Table(name = "teams")
public class Team{

    @Id
    @Column(name = "team_id")
    private Integer team_id;

    @Column(name = "winning_rate")
    private float WinningRate;

    //сыязь две команды - игра

    public Integer getId() {
        return team_id;
    }

    public void setId(Integer id) {
        this.team_id = id;
    }

    public float getWinningRate() {
        return WinningRate;
    }

    public void setWinningRate(float winningRate) {
        WinningRate = winningRate;
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
import com.example.stavki.model.Team;
import com.example.stavki.model.Game;

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


    @ManyToMany
    @JoinTable(
            name = "previous_games",
            joinColumns ={@JoinColumn(name = "game")},
            inverseJoinColumns = {@JoinColumn(name = "the_second_team")}
    )
    private List<Game> previousGames;

    @ManyToMany
    @JoinTable(
            name = "previous_games",
            joinColumns ={@JoinColumn(name = "the_second_team")},
            inverseJoinColumns = {@JoinColumn(name = "game")}
    )
    private List<Team> duo;

    /*
    //@ApiModelProperty
    @ManyToMany(mappedBy = "duo")
    private List<Game> previousGames;*/

    /*
    @ApiModelProperty
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "team")
    private List<Game> previousGames;*/

    /*
    @ApiModelProperty
    @Column(name = "WINNING_RATE")
    private float winningRate;
}*/
