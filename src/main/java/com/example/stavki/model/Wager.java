package com.example.stavki.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.annotation.Generated;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import java.math.BigDecimal;

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
    @JoinColumn(name = "GAME_FK", nullable = false)
    private Game game;

    @ApiModelProperty
    @Id
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "CLIENT_FK", nullable = false)
    private Client client;

    @ApiModelProperty
    @Column(name = "MONEY")
    private double money;

    @ApiModelProperty
    @Column(name = "PREDICTION")
    private int TeamToWin;
}
