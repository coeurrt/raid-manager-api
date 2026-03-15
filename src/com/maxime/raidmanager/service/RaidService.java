package com.maxime.raidmanager.service;

import com.maxime.raidmanager.dto.CreateRaidRequestDto;
import com.maxime.raidmanager.dto.RaidResponseDto;
import com.maxime.raidmanager.entity.Raid;
import com.maxime.raidmanager.mapper.RaidMapper;
import com.maxime.raidmanager.repository.RaidRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

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
        this.raidRepository.save(raid);
        return RaidMapper.toResponseDto(raid);
    }

    public RaidResponseDto getRaidByName(String name){
        Raid raid = raidRepository
                .findByName(name)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Raid not found: " + name
                ));

        return RaidMapper.toResponseDto(raid);
    }

}
