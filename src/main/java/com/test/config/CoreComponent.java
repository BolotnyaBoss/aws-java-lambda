package com.test.config;

import com.test.handlers.CreateSponsorHandler;
import com.test.handlers.GetSponsorsHandler;
import com.test.handlers.FindSponsorHandler;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {CoreModule.class})
public interface CoreComponent {

    void inject(CreateSponsorHandler requestHandler);

    void inject(GetSponsorsHandler requestHandler);

    void inject(FindSponsorHandler requestHandler);

}