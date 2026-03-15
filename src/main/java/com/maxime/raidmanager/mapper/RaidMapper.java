package com.maxime.raidmanager.mapper;

import com.maxime.raidmanager.dto.CreateRaidRequestDto;
import com.maxime.raidmanager.dto.RaidResponseDto;
import com.maxime.raidmanager.entity.Raid;

public class RaidMapper {
    public static RaidResponseDto toResponseDto(Raid raid) {
        return new RaidResponseDto(
                raid.getId(),
                raid.getName(),
                raid.getPlayers()
        );
    }

    public static Raid toEntity(CreateRaidRequestDto dto) {
        return new Raid(
                null,
                dto.getName(),
                dto.getPlayers()
        );
    }

}
