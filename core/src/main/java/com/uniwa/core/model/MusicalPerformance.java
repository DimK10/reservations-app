package com.uniwa.core.model;

public class MusicalPerformance extends Performance {
    private Person singer;

    public Person getSinger() {
        return singer;
    }

    public void setSinger(Person singer) {
        this.singer = singer;
    }
}
