package com.brunopw.weshareapi.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "locations")
public class Location implements Serializable {
    private static final long serialVersionUID = 7429674765219009616L;

    @Id @GeneratedValue
    private Long id;
    private String country;
    private String street;
    private String complement;
    @ManyToOne(fetch = FetchType.EAGER)
    private City city;
    private String state;
    private String postalCode;
    @ManyToOne(fetch = FetchType.EAGER)
    private Coordinates coordinates;

    public Location() {}

    public Location(Long id, String country, String street, String complement, City city, String state, String postalCode, Coordinates coordinates) {
        this.id = id;
        this.country = country;
        this.street = street;
        this.complement = complement;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.coordinates = coordinates;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", street='" + street + '\'' +
                ", complement='" + complement + '\'' +
                ", city=" + city +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", coordinates='" + coordinates + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String country;
        private String street;
        private String complement;
        private City city;
        private String state;
        private String postalCode;

        private Coordinates coordinates;

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder withStreet(String street) {
            this.street = street;
            return this;
        }

        public Builder withComplement(String complement) {
            this.complement = complement;
            return this;
        }

        public Builder withCity(City city) {
            this.city = city;
            return this;
        }

        public Builder withState(String state) {
            this.state = state;
            return this;
        }

        public Builder withPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder withCoordinates(Coordinates coordinates) {
            this.coordinates = coordinates;
            return this;
        }

        public Location build() {
            Location location = new Location();
            location.setId(id);
            location.setCountry(country);
            location.setStreet(street);
            location.setComplement(complement);
            location.setCity(city);
            location.setState(state);
            location.setPostalCode(postalCode);
            location.setCoordinates(coordinates);
            return location;
        }
    }
}
