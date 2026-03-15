package com.maxime.raidmanager.entity;

public class Raid {

    private Long id;
    private String name;
    private int players;

    public Raid(Long id, String name, int players) {
        this.id = id;
        this.name = name;
        this.players = players;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPlayers() {
        return players;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
