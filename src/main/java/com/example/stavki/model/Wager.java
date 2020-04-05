package com.example.stavki.model;

import javax.persistence.*;
import com.example.stavki.model.Game;

import java.util.List;

@SuppressWarnings("JpaAttributeTypeInspection")
@Entity
@Table(name = "Wagers")
public class Wager{

    @Id
    private Integer wager_id;

    //private Game game;//тут было ворнинг

    private int teamToWin;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "client_id",nullable = false)
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Integer getWager_id() {
        return wager_id;
    }

    public void setWager_id(Integer wager_id) {
        this.wager_id = wager_id;
    }

    /*public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }*/
}


























/*
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

import javax.persistence.*;
import org.springframework.context.annotation.Primary;
/*
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.annotation.Generated;
import javax.persistence.*; //для OneToMany

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import java.io.Serializable;
import java.math.BigDecimal;
*/

/*
@ApiModel
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "WAGERS")
public class Wager {

    @ApiModelProperty
    @Id
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    //@JoinColumn(name = "GAME_FK", nullable = false)
    private Game game;
/*
    @ApiModelProperty
    @Id
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "CLIENT_FK", nullable = false)
    private Client client;*/

/*
    @ApiModelProperty
    @Column(name = "MONEY")
    private double money;

    @ApiModelProperty
    @Column(name = "PREDICTION")
    private int TeamToWin;

    public int getTeamToWin() {
        return TeamToWin;
    }

    public void setTeamToWin(int teamToWin) {
        TeamToWin = teamToWin;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    //getters and setters for jpa to initialize these fields
}*/
