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

    public SponsorModel createSponsor(SponsorModel sponsor) {
        // Logic to save the sponsor
        return sponsor;
    }

    public List<SponsorModel> getAllSponsors() {
        // Logic to retrieve all sponsors
        return Collections.emptyList();
    }

    public List<SponsorModel> getSponsors() {
        SponsorModel sponsor = new SponsorModel("1", "test");
        return Collections.singletonList(sponsor);
    }

    public SponsorModel getSponsorById(String id) {
        if ("test".equals(id)) {
            throw new SponsorNotFoundException("Cannot find sponsor with provided ID");
        } else {
            return new SponsorModel("1", "test");
        }
    }
}
