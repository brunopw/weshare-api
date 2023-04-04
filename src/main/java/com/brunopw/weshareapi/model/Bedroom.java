package com.brunopw.weshareapi.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "bedrooms")
public class Bedroom implements Serializable {
    private static final long serialVersionUID = 2807415327440161727L;

    @Id @GeneratedValue
    private Long id;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Bed> beds;

    public Bedroom() {}

    public Bedroom(Long id, List<Bed> beds) {
        this.id = id;
        this.beds = beds;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Bed> getBeds() {
        return beds;
    }

    public void setBeds(List<Bed> beds) {
        this.beds = beds;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "id=" + id +
                ", beds=" + beds +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private List<Bed> beds;

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withBeds(List<Bed> beds) {
            this.beds = beds;
            return this;
        }

        public Bedroom build() {
            Bedroom bedroom = new Bedroom();
            bedroom.setId(id);
            bedroom.setBeds(beds);
            return bedroom;
        }
    }
}
