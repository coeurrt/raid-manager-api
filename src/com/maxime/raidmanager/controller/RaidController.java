package com.maxime.raidmanager.controller;

import com.maxime.raidmanager.dto.RaidResponseDto;
import com.maxime.raidmanager.entity.Raid;
import com.maxime.raidmanager.service.RaidService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
