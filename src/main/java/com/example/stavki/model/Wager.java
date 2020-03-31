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
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false, updatable = false)
    private int id;

    @ApiModelProperty
    @Id
    @Column(name = "GAME_FK", unique = true, nullable = false, updatable = false)
    private Long gameFK;

    @ApiModelProperty
    @Id
    @Column(name = "CLIENT_FK", unique = true, nullable = false, updatable = false)
    private Long clientFK;

    @ApiModelProperty
    @Column(name = "MONEY")
    private BigDecimal money;

    @ApiModelProperty
    @Column(name = "PREDICTION_ON_FIRST_TEAM")
    private boolean isFirstTeamWinning;
}
