package com.company.afm_project.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.UUID;

@JmixEntity
@Table(name = "TEAM")
@Entity
public class Team {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "TEAM_NAME", nullable = false)
    @NotNull
    private String teamName;

    @NotNull
    @JoinColumn(name = "COACH")
    @OneToOne(fetch = FetchType.LAZY)
    private Coach coach;

    @Positive
    @Column(name = "ACTIVE_PLAYERS")
    private Long activePlayers;

    @Positive
    @Column(name = "RESERVE_PLAYERS")
    private Long reservePlayers;

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Coach getCoach() {
        return coach;
    }

    public Long getReservePlayers() {
        return reservePlayers;
    }

    public void setReservePlayers(Long reservePlayers) {
        this.reservePlayers = reservePlayers;
    }

    public Long getActivePlayers() {
        return activePlayers;
    }

    public void setActivePlayers(Long activePlayers) {
        this.activePlayers = activePlayers;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}