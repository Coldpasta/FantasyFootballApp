package com.lm.footballzone.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_data")
public class Player {

    @Id
    @Column(name = "player_name", unique = true)
    private String name;
    private String nation;
    private String position;
    private Integer age;
    private Integer matchesPlayer;
    private Integer starts;
    private Double minutesPlayed;
    private Double goals;
    private Double assists;
    private Double peneltiesScored;
    private Double yellowCards;
    private Double redCards;
    private Double expectedGoals;
    private Double expectedAssists;
    private String teamName;

    public Player(String teamName, Double expectedAssists, Double expectedGoals, Double redCards, Double yellowCards, Double peneltiesScored, Double assists, Double goals, Double minutesPlayed, Integer starts, Integer matchesPlayer, Integer age, String position, String nation, String name) {
        this.teamName = teamName;
        this.expectedAssists = expectedAssists;
        this.expectedGoals = expectedGoals;
        this.redCards = redCards;
        this.yellowCards = yellowCards;
        this.peneltiesScored = peneltiesScored;
        this.assists = assists;
        this.goals = goals;
        this.minutesPlayed = minutesPlayed;
        this.starts = starts;
        this.matchesPlayer = matchesPlayer;
        this.age = age;
        this.position = position;
        this.nation = nation;
        this.name = name;
    }

    public Player(String name) {
        this.name = name;
    }

    public Player() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMatchesPlayer() {
        return matchesPlayer;
    }

    public void setMatchesPlayer(Integer matchesPlayer) {
        this.matchesPlayer = matchesPlayer;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(Double minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public Double getGoals() {
        return goals;
    }

    public void setGoals(Double goals) {
        this.goals = goals;
    }

    public Double getAssists() {
        return assists;
    }

    public void setAssists(Double assists) {
        this.assists = assists;
    }

    public Double getPeneltiesScored() {
        return peneltiesScored;
    }

    public void setPeneltiesScored(Double peneltiesScored) {
        this.peneltiesScored = peneltiesScored;
    }

    public Double getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(Double yellowCards) {
        this.yellowCards = yellowCards;
    }

    public Double getRedCards() {
        return redCards;
    }

    public void setRedCards(Double redCards) {
        this.redCards = redCards;
    }

    public Double getExpectedGoals() {
        return expectedGoals;
    }

    public void setExpectedGoals(Double expectedGoals) {
        this.expectedGoals = expectedGoals;
    }

    public Double getExpectedAssists() {
        return expectedAssists;
    }

    public void setExpectedAssists(Double expectedAssists) {
        this.expectedAssists = expectedAssists;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

}
