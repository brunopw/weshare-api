package com.brunopw.weshareapi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "cities")
public class City implements Serializable {
    private static final long serialVersionUID = 6276718030351430221L;

    @Id @GeneratedValue
    private Long id;
    private String name;
    private double cityCentreLatitude;
    private double cityCentreLongitude;

    public City() {}

    public City(Long id, String name, double cityCentreLatitude, double cityCentreLongitude) {
        this.id = id;
        this.name = name;
        this.cityCentreLatitude = cityCentreLatitude;
        this.cityCentreLongitude = cityCentreLongitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCityCentreLatitude() {
        return cityCentreLatitude;
    }

    public void setCityCentreLatitude(double cityCentreLatitude) {
        this.cityCentreLatitude = cityCentreLatitude;
    }

    public double getCityCentreLongitude() {
        return cityCentreLongitude;
    }

    public void setCityCentreLongitude(double cityCentreLongitude) {
        this.cityCentreLongitude = cityCentreLongitude;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cityCentreLatitude=" + cityCentreLatitude +
                ", cityCentreLongitude=" + cityCentreLongitude +
                '}';
    }


    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String name;
        private double cityCentreLatitude;
        private double cityCentreLongitude;

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withCityCentreLatitude(double cityCentreLatitude) {
            this.cityCentreLatitude = cityCentreLatitude;
            return this;
        }

        public Builder withCityCentreLongitude(double cityCentreLongitude) {
            this.cityCentreLongitude = cityCentreLongitude;
            return this;
        }

        public City build() {
            City city = new City();
            city.setId(id);
            city.setName(name);
            city.setCityCentreLatitude(cityCentreLatitude);
            city.setCityCentreLongitude(cityCentreLongitude);
            return city;
        }
    }
}
