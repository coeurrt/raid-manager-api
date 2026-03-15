package com.maxime.raidmanager.repository;

import com.maxime.raidmanager.entity.Raid;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RaidRepository {

    private final List<Raid> raids = new ArrayList<>();

    public RaidRepository() {
        raids.add(new Raid("Molten Core", 40));
        raids.add(new Raid("Icecrown Citadel", 25));
        raids.add(new Raid("Black Temple", 25));
    }

    public List<Raid> findAll() {
        return raids;
    }

    public Raid findByName(String name){
        return raids.stream()
                .filter(raid -> raid.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public Raid save(Raid raid){
        raids.add(raid);
        return raid;
    }
}
