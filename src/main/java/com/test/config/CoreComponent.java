package com.test.config;

import com.test.controller.SponsorController;
import com.test.handlers.FindSponsorHandler;
import com.test.handlers.GetSponsorsHandler;
import com.test.service.SponsorService;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {CoreModule.class})
public interface CoreComponent {

    void inject(GetSponsorsHandler requestHandler);

    void inject(FindSponsorHandler requestHandler);

    // New injections
    void inject(SponsorService sponsorService);

    void inject(SponsorController sponsorController);

}