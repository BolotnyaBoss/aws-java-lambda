package com.test.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.test.service.SponsorService;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;

@Slf4j
public class GetAllSponsorsHandler {

    @Inject
    SponsorService sponsorService;

    public APIGatewayProxyResponseEvent handle(APIGatewayProxyRequestEvent request, Context context) {
        // Retrieve all sponsors using the SponsorService
        // Return the list of SponsorModel objects in the response
    }
}