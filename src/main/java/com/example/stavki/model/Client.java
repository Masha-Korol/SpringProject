package com.example.stavki.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client{

    @Id
    @Column(name = "id",unique = true)
    Integer client_id;

    @Column(name = "name")
    private String name;

    @Column(name = "money")
    private double money;

    //mappedBy - имя тарибута сущности для связи с ним
    // 1 client, many wagers
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "client")
    private List<Wager> current_wagers;

    public List<Wager> getCurrent_wagers() {
        return current_wagers;
    }

    public void setCurrent_wagers(List<Wager> current_wagers) {
        this.current_wagers = current_wagers;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "client")
    private List<Wager> history_wagers;

    public List<Wager> getHistory_wagers() {
        return history_wagers;
    }

    public void setHistory_wagers(List<Wager> history_wagers) {
        this.history_wagers = history_wagers;
    }

    public Integer getId() {
        return client_id;
    }

    public void setId(Integer id) {
        this.client_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}



















/*
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.annotation.Generated;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

@ApiModel
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLIENTS")
public class Client {

    @ApiModelProperty
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false, updatable = false)
    private int id;

    /*
    @ApiModelProperty
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "client")
    private List<Wager> current;

    @ApiModelProperty
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "client")
    private List<Wager> history;*/

/*


    @ApiModelProperty
    @Column(name = "NAME")
    private String name;

    @ApiModelProperty
    @Column(name = "MONEY")
    private double money;
}*/
