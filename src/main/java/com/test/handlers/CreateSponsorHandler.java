package com.test.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.test.service.SponsorService;
import com.test.model.SponsorModel;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;

@Slf4j
public class CreateSponsorHandler extends ApiHandler {

    @Inject
    SponsorService sponsorService;

    @Override
    public APIGatewayProxyResponseEvent handle(APIGatewayProxyRequestEvent input, Context context) {
        // Assume the body contains 'id' and 'name'
        Map<String,String> requestBody = jsonService.fromJson(input.getBody(), Map.class);
        String id = requestBody.get("id");
        String name = requestBody.get("name");
        
        SponsorModel sponsor = sponsorService.createSponsor(id, name);
        
        return new APIGatewayProxyResponseEvent()
                .withBody(jsonService.toJson(sponsor))
                .withStatusCode(201);
    }
}