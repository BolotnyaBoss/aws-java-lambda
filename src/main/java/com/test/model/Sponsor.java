package com.test.model;

import lombok.Data;

@Data
public class Sponsor {
    private String id;
    private String name;

    public Sponsor() {}

    public Sponsor(String id, String name) {
        this.id = id;
        this.name = name;
    }
}