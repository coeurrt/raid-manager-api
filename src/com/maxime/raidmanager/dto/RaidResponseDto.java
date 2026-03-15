package com.maxime.raidmanager.dto;

public class RaidResponseDto {
    private Long id;
    private String name;
    private int players;

    public RaidResponseDto() {
    }

    public RaidResponseDto(Long id, String name, int players) {
        this.name = name;
        this.id = id;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public int getPlayers() {
        return players;
    }

    public Long getId() {
        return id;
    }
}
