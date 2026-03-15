package com.maxime.raidmanager.repository;

import com.maxime.raidmanager.entity.Raid;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RaidRepository {

    private final List<Raid> raids = new ArrayList<>();
    private long nextId = 1;

    public RaidRepository() {
        raids.add(new Raid(nextId, "Molten Core", 40));
        nextId++;
        raids.add(new Raid(nextId, "Icecrown Citadel", 25));
        nextId++;
        raids.add(new Raid(nextId, "Black Temple", 25));
        nextId++;
    }

    public List<Raid> findAll() {
        return raids;
    }

    public Optional<Raid> findById(Long id) {
        return raids.stream()
                .filter(raid -> raid.getId().equals(id))
                .findFirst();
    }

    public Raid save(Raid raid) {
        if (raid.getId() == null) {
            raid.setId(nextId);
            nextId++;
        }

        raids.add(raid);
        return raid;
    }
}
