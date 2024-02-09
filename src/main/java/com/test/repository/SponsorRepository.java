package com.test.repository;

public interface SponsorRepository {
    void save(Sponsor sponsor);
    List<Sponsor> findAll();
}