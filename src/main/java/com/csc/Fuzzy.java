package com.csc;

public class Fuzzy implements Feeling {
    private String color;

    public Fuzzy(String color) {
        this.color = color;
    }

    @Override
    public String description() {
        return color;
    }
}
