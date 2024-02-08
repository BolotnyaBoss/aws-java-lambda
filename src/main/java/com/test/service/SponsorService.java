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

    // Method to create a new SponsorModel and save it
    public SponsorModel createSponsor(String id, String name) {
        SponsorModel newSponsor = new SponsorModel(id, name);
        // Logic to save the sponsor would go here
        return newSponsor;
    }

    // Method to return a list of all SponsorModel instances
    public List<SponsorModel> getAllSponsors() {
        // Logic to retrieve all sponsors would go here
        return new ArrayList<>();
    }
}
