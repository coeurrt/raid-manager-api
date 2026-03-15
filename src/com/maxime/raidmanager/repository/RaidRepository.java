package com.maxime.raidmanager.repository;

import com.maxime.raidmanager.entity.Raid;

import java.util.ArrayList;
import java.util.List;

public class RaidRepository {

    public List<Raid> findAll() {
        List<Raid> raids = new ArrayList<>();

        raids.add(new Raid("Molten Core", 40));
        raids.add(new Raid("Icecrown Citadel", 25));
        raids.add(new Raid("Black Temple", 25));

        return raids;
    }
}
