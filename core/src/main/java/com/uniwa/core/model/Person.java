package com.uniwa.core.model;

import com.uniwa.core.enums.Profession;

public class Person extends BaseEntity {

    private String name;
    private Profession profession;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }
}
