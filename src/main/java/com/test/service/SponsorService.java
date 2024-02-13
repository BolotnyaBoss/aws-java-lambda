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
    public SponsorModel createSponsor(String id, String name) {
        SponsorModel newSponsor = new SponsorModel(id, name);
        // Code to save the new sponsor to the database or in-memory store should be added here
        return newSponsor;
    }
}

    public List<SponsorModel> getSponsors() {
        SponsorModel sponsor = new SponsorModel("1", "test");
        return Collections.singletonList(sponsor);
    public SponsorModel createSponsor(String id, String name) {
        SponsorModel newSponsor = new SponsorModel(id, name);
        // Code to save the new sponsor to the database or in-memory store should be added here
        return newSponsor;
    }
}

    public SponsorModel getSponsorById(String id) {
        if ("test".equals(id)) {
            throw new SponsorNotFoundException("Cannot find sponsor with provided ID");
        public SponsorModel createSponsor(String id, String name) {
        SponsorModel newSponsor = new SponsorModel(id, name);
        // Code to save the new sponsor to the database or in-memory store should be added here
        return newSponsor;
    }
} else {
            return new SponsorModel("1", "test");
        public SponsorModel createSponsor(String id, String name) {
        SponsorModel newSponsor = new SponsorModel(id, name);
        // Code to save the new sponsor to the database or in-memory store should be added here
        return newSponsor;
    }
}
    public SponsorModel createSponsor(String id, String name) {
        SponsorModel newSponsor = new SponsorModel(id, name);
        // Code to save the new sponsor to the database or in-memory store should be added here
        return newSponsor;
    }
}
public SponsorModel createSponsor(String id, String name) {
        SponsorModel newSponsor = new SponsorModel(id, name);
        // Code to save the new sponsor to the database or in-memory store should be added here
        return newSponsor;
    }
}
