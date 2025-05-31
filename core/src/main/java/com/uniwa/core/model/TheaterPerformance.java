package com.uniwa.core.model;

public class TheaterPerformance extends Performance {

    private Person protagonist;

    public Person getProtagonist() {
        return protagonist;
    }

    public void setProtagonist(Person protagonist) {
        this.protagonist = protagonist;
    }
}
