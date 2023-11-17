package com.test.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.test.model.SponsorModel;
import com.test.service.SponsorService;

import javax.inject.Inject;

public class DeleteSponsorHandler implements RequestHandler<SponsorModel, Void> {

    private final SponsorService sponsorService;

    @Inject
    public DeleteSponsorHandler(SponsorService sponsorService) {
        this.sponsorService = sponsorService;
    }

    @Override
    public Void handleRequest(SponsorModel input, Context context) {
        String sponsorId = input.getId();
        sponsorService.deleteSponsorById(sponsorId);
        return null;
    }
}
