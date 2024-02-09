package com.test.controller;

import com.test.model.SponsorModel;
import com.test.service.SponsorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sponsors")
public class SponsorController {

    private final SponsorService sponsorService;

    @Autowired
    public SponsorController(SponsorService sponsorService) {
        this.sponsorService = sponsorService;
    }

    @PostMapping
    public ResponseEntity<SponsorModel> createSponsor(@RequestBody SponsorModel sponsor) {
        SponsorModel newSponsor = sponsorService.createSponsor(sponsor);
        return ResponseEntity.ok(newSponsor);
    }

    @GetMapping
    public ResponseEntity<List<SponsorModel>> getAllSponsors() {
        List<SponsorModel> sponsors = sponsorService.getAllSponsors();
        return ResponseEntity.ok(sponsors);
    }
}