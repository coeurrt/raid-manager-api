package com.maxime.raidmanager.service;

import com.maxime.raidmanager.entity.Raid;
import com.maxime.raidmanager.repository.RaidRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaidService {

    private final RaidRepository raidRepository;

    public RaidService(RaidRepository raidRepository) {
        this.raidRepository = raidRepository;
    }

    public List<Raid> getAllRaids(){
        return raidRepository.findAll();
    }

}
