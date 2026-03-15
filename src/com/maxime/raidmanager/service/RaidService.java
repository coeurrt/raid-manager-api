package com.maxime.raidmanager.service;

import com.maxime.raidmanager.dto.CreateRaidRequestDto;
import com.maxime.raidmanager.dto.RaidResponseDto;
import com.maxime.raidmanager.entity.Raid;
import com.maxime.raidmanager.mapper.RaidMapper;
import com.maxime.raidmanager.repository.RaidRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class RaidService {

    private final RaidRepository raidRepository;

    public RaidService(RaidRepository raidRepository) {
        this.raidRepository = raidRepository;
    }

    public List<RaidResponseDto> getAllRaids() {

        return raidRepository.findAll()
                .stream()
                .map(RaidMapper::toResponseDto)
                .toList();
    }

    public RaidResponseDto createRaid(CreateRaidRequestDto requestDto){
        Raid raid = RaidMapper.toEntity(requestDto);
        return RaidMapper.toResponseDto(raid);
    }

}
