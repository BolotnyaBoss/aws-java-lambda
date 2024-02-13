package com.test.service;

import com.test.errors.SponsorNotFoundException;
import com.test.model.Sponsor;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
@Slf4j
public class SponsorService {

    private final List<Sponsor> sponsors = new ArrayList<>();

    @Inject
    public SponsorService() {
        // Optionally, add default sponsors here
    }

    public List<Sponsor> getSponsors() {
        return new ArrayList<>(sponsors);
    }

    public void createSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

    public Sponsor getSponsorById(String id) throws SponsorNotFoundException {
        return sponsors.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new SponsorNotFoundException("Cannot find sponsor with id: " + id));
    }
}
