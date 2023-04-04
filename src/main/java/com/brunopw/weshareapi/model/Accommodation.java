package com.brunopw.weshareapi.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "accommodations")
public class Accommodation implements Serializable {
    private static final long serialVersionUID = 6658651119045149068L;

    @Id @GeneratedValue
    private Long id;

    private AccommodationType type;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Bedroom> bedrooms;
    private int bathrooms;
    @OneToOne(fetch = FetchType.EAGER)
    private Location location;
    @OneToOne(fetch = FetchType.EAGER)
    private Facilities facilities;
    @OneToOne(fetch = FetchType.EAGER)
    private Rules rules;
    private String additionalRules;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Photo> photos;
    private String description;
    private LocalDateTime availability;
    @ManyToOne(fetch = FetchType.EAGER)
    private User landlord;
    @ManyToOne(fetch = FetchType.EAGER)
    private User tenant;

    private Status status;

    public Accommodation() {}

    public Accommodation(Long id, AccommodationType type, List<Bedroom> bedrooms, int bathrooms, Location location, Facilities facilities, Rules rules, String additionalRules, List<Photo> photos, String description, LocalDateTime availability, User landlord, User tenant, Status status) {
        this.id = id;
        this.type = type;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.location = location;
        this.facilities = facilities;
        this.rules = rules;
        this.additionalRules = additionalRules;
        this.photos = photos;
        this.description = description;
        this.availability = availability;
        this.landlord = landlord;
        this.tenant = tenant;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AccommodationType getType() {
        return type;
    }

    public void setType(AccommodationType type) {
        this.type = type;
    }

    public List<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(List<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }

    public Rules getRules() {
        return rules;
    }

    public void setRules(Rules rules) {
        this.rules = rules;
    }

    public String getAdditionalRules() {
        return additionalRules;
    }

    public void setAdditionalRules(String additionalRules) {
        this.additionalRules = additionalRules;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getAvailability() {
        return availability;
    }

    public void setAvailability(LocalDateTime availability) {
        this.availability = availability;
    }

    public User getLandlord() {
        return landlord;
    }

    public void setLandlord(User landlord) {
        this.landlord = landlord;
    }

    public User getTenant() {
        return tenant;
    }

    public void setTenant(User tenant) {
        this.tenant = tenant;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Accommodation{" +
                "id=" + id +
                ", type=" + type +
                ", bedrooms=" + bedrooms +
                ", bathrooms=" + bathrooms +
                ", location=" + location +
                ", facilities=" + facilities +
                ", rules=" + rules +
                ", additionalRules='" + additionalRules + '\'' +
                ", photos=" + photos +
                ", description='" + description + '\'' +
                ", availability=" + availability +
                ", landlord=" + landlord +
                ", tenant=" + tenant +
                ", status=" + status +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private AccommodationType type;
        private List<Bedroom> bedrooms;
        private int bathrooms;
        private Location location;
        private Facilities facilities;
        private Rules rules;
        private String additionalRules;
        private List<Photo> photos;
        private String description;
        private LocalDateTime availability;
        private User landlord;
        private User tenant;

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withType(AccommodationType type) {
            this.type = type;
            return this;
        }

        public Builder withBedrooms(List<Bedroom> bedrooms) {
            this.bedrooms = bedrooms;
            return this;
        }

        public Builder withBathrooms(int bathrooms) {
            this.bathrooms = bathrooms;
            return this;
        }

        public Builder withLocation(Location location) {
            this.location = location;
            return this;
        }

        public Builder withFacilities(Facilities facilities) {
            this.facilities = facilities;
            return this;
        }

        public Builder withRules(Rules rules) {
            this.rules = rules;
            return this;
        }

        public Builder withAdditionalRules(String additionalRules) {
            this.additionalRules = additionalRules;
            return this;
        }

        public Builder withPhotos(List<Photo> photos) {
            this.photos = photos;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withAvailability(LocalDateTime availability) {
            this.availability = availability;
            return this;
        }

        public Builder withLandlord(User landlord) {
            this.landlord = landlord;
            return this;
        }

        public Builder withTenant(User tenant) {
            this.tenant = tenant;
            return this;
        }

        public Accommodation build() {
            Accommodation accommodation = new Accommodation();
            accommodation.setId(id);
            accommodation.setType(type);
            accommodation.setBedrooms(bedrooms);
            accommodation.setBathrooms(bathrooms);
            accommodation.setLocation(location);
            accommodation.setFacilities(facilities);
            accommodation.setRules(rules);
            accommodation.setAdditionalRules(additionalRules);
            accommodation.setPhotos(photos);
            accommodation.setDescription(description);
            accommodation.setAvailability(availability);
            accommodation.setLandlord(landlord);
            accommodation.setTenant(tenant);
            return accommodation;
        }
    }
}
