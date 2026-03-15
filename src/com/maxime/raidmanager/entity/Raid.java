package com.maxime.raidmanager.entity;

public class Raid {

    private String name;
    private int players;

    public Raid(String name, int players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public int getPlayers() {
        return players;
    }
}
