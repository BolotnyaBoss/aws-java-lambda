package com.test.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.test.config.CoreComponent;
import com.test.config.DaggerCoreComponent;
import com.test.service.SponsorService;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;

@Slf4j
public class CreateSponsorHandler extends ApiHandler {

    @Inject
    SponsorService sponsorService;
    protected final CoreComponent coreComponent;

    public CreateSponsorHandler() {
        coreComponent = DaggerCoreComponent.builder().build();
        coreComponent.inject(this);
    }

    @Override
    public APIGatewayProxyResponseEvent handle(APIGatewayProxyRequestEvent input, Context context) {
        // Code to handle the creation of a new sponsor using the SponsorService should be added here
        // This would involve parsing the input, creating a sponsor, and returning the appropriate response
        return null; // Placeholder for actual implementation
    }
}