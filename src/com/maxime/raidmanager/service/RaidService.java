package com.maxime.raidmanager.service;

import com.maxime.raidmanager.entity.Raid;
import com.maxime.raidmanager.repository.RaidRepository;

import java.util.List;

public class RaidService {

    private final RaidRepository raidRepository;

    public RaidService(RaidRepository raidRepository) {
        this.raidRepository = raidRepository;
    }

    public List<Raid> getAllRaids(){
        return raidRepository.findAll();
    }

}
