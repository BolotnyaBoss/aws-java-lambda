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
        // Parse request and create new sponsor logic here
        // Return the created sponsor with a 201 status code
        return new APIGatewayProxyResponseEvent().withStatusCode(201);
    }
}