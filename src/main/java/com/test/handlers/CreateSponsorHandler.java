package com.test.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.test.service.SponsorService;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;

@Slf4j
public class CreateSponsorHandler {

    @Inject
    SponsorService sponsorService;

    public APIGatewayProxyResponseEvent handle(APIGatewayProxyRequestEvent request, Context context) {
        // Extract 'id' and 'name' from the request body
        // Create a new Sponsor using the SponsorService
        // Return the created SponsorModel object in the response
    }
}