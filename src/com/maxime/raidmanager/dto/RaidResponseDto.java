package com.maxime.raidmanager.dto;

import com.maxime.raidmanager.entity.Raid;

import java.util.List;

public class RaidResponseDto {
    private String name;
    private int players;

    public RaidResponseDto(String name, int players) {
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
