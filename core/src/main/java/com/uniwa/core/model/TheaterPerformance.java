package com.uniwa.core.model;

import java.util.Date;

public class TheaterPerformance extends Performance {

    private final Person protagonist;

    public TheaterPerformance(Builder builder) {
        super.setId(builder.id);
        super.setTitle(builder.title);
        super.setPlace(builder.place);
        super.setPerformanceDate(builder.performanceDate);
        this.protagonist = builder.protagonist;
    }

    public Person getProtagonist() {
        return protagonist;
    }

    public static class Builder extends EntityBuilder<TheaterPerformance, Builder> {
        private Long id;
        private String title;
        private Place place;
        private Date performanceDate;
        private Person protagonist;

        public Builder setId(Long id) {
            this.id = id;
            return self();
        }

        public Builder setTitle(String title) {
            this.title = title;
            return self();
        }

        public Builder setPlace(Place place) {
            this.place = place;
            return self();
        }

        public Builder setPerformanceDate(Date performanceDate) {
            this.performanceDate = performanceDate;
            return self();
        }

        public Builder setProtagonist(Person protagonist) {
            this.protagonist = protagonist;
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public TheaterPerformance build() {
            return new TheaterPerformance(this);
        }
    }
}
