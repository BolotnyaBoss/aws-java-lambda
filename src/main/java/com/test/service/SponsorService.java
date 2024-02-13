package com.test.service;

import com.test.errors.SponsorNotFoundException;
import com.test.model.SponsorModel;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Singleton
@Slf4j
public class SponsorService {

    private final ConcurrentHashMap<String, SponsorModel> sponsors = new ConcurrentHashMap<>();

    @Inject
    public SponsorService() {
    }

    public void createSponsor(SponsorModel sponsor) {
        if (sponsors.containsKey(sponsor.getId())) {
            throw new IllegalArgumentException("Sponsor with the same ID already exists.");
        }
        sponsors.put(sponsor.getId(), sponsor);
    }

    public List<SponsorModel> getSponsors() {
        return new ArrayList<>(sponsors.values());
    }

    public SponsorModel getSponsorById(String id) {
        SponsorModel sponsor = sponsors.get(id);
        if (sponsor == null) {
            throw new SponsorNotFoundException("Cannot find sponsor with provided ID");
        }
        return sponsor;
    }
}
