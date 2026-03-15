package com.maxime.raidmanager.dto;

public class CreateRaidRequestDto {

    private String name;
    private int players;

    public CreateRaidRequestDto() {
    }

    public CreateRaidRequestDto(String name, int players) {
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
