package com.company.afm_project.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.UUID;

@JmixEntity
@Table(name = "PLAYER", indexes = {
        @Index(name = "IDX_PLAYER_TEAM_ID", columnList = "")
})
@Entity
public class Player {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @NotNull
    @InstanceName
    @Column(name = "NAME")
    private String name;

    @Column(name = "POSITION_", nullable = false)
    @NotNull
    private String position;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    @Positive
    @Column(name = "AGE", nullable = false)
    @NotNull
    private Long age;

    @Positive
    @Column(name = "WEIGHT", nullable = false)
    @NotNull
    private Long weight;

    @NotNull
    @Positive
    @Column(name = "HIGHT")
    private Long hight;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setHight(Long hight) {
        this.hight = hight;
    }

    public Long getHight() {
        return hight;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}