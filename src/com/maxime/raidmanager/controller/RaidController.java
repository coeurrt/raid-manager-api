package com.maxime.raidmanager.controller;

import com.maxime.raidmanager.dto.CreateRaidRequestDto;
import com.maxime.raidmanager.dto.RaidResponseDto;
import com.maxime.raidmanager.service.RaidService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/raids")
public class RaidController {

    private final RaidService raidService;

    public RaidController(RaidService raidService) {
        this.raidService = raidService;
    }

    @GetMapping
    public List<RaidResponseDto> getRaids() {
        return raidService.getAllRaids();
    }

    @PostMapping
    public RaidResponseDto createRaid(@RequestBody CreateRaidRequestDto requestDto){
        return raidService.createRaid(requestDto);
    }

}
