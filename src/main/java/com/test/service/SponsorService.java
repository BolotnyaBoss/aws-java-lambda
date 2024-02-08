package com.test.service;

import com.test.errors.SponsorNotFoundException;
import com.test.model.SponsorModel;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Collections;
import java.util.List;

@Singleton
@Slf4j
public class SponsorService {

    @Inject
    public SponsorService() {
    }

    private ConcurrentHashMap<String, SponsorModel> sponsors = new ConcurrentHashMap<>();

    public SponsorModel createSponsor(String id, String name) {
        SponsorModel sponsor = new SponsorModel(id, name);
        sponsors.put(id, sponsor);
        return sponsor;
    }

    public List<SponsorModel> getAllSponsors() {
        return new ArrayList<>(sponsors.values());
    }

    public List<SponsorModel> getSponsors() {
        return new ArrayList<>(sponsors.values());
    }

    public SponsorModel getSponsorById(String id) {
        return sponsors.getOrDefault(id, new SponsorModel(id, "Unknown Sponsor"));
    }
}
