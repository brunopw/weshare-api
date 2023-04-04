package com.brunopw.weshareapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "rules")
public class Rules implements Serializable {
    private static final long serialVersionUID = 767910983164245500L;

    @Id @GeneratedValue
    private Long id;
    private boolean petsAllowed;
    private boolean smokingAllowed;
    private boolean eventsAllowed;
    private String additionalRules;

    public Rules() {}

    public Rules(Long id, boolean petsAllowed, boolean smokingAllowed, boolean eventsAllowed, String additionalRules) {
        this.id = id;
        this.petsAllowed = petsAllowed;
        this.smokingAllowed = smokingAllowed;
        this.eventsAllowed = eventsAllowed;
        this.additionalRules = additionalRules;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPetsAllowed() {
        return petsAllowed;
    }

    public void setPetsAllowed(boolean petsAllowed) {
        this.petsAllowed = petsAllowed;
    }

    public boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    public void setSmokingAllowed(boolean smokingAllowed) {
        this.smokingAllowed = smokingAllowed;
    }

    public boolean isEventsAllowed() {
        return eventsAllowed;
    }

    public void setEventsAllowed(boolean eventsAllowed) {
        this.eventsAllowed = eventsAllowed;
    }

    public String getAdditionalRules() {
        return additionalRules;
    }

    public void setAdditionalRules(String additionalRules) {
        this.additionalRules = additionalRules;
    }

    @Override
    public String toString() {
        return "Rules{" +
                "id=" + id +
                ", petsAllowed=" + petsAllowed +
                ", smokingAllowed=" + smokingAllowed +
                ", eventsAllowed=" + eventsAllowed +
                ", additionalRules='" + additionalRules + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private boolean petsAllowed;
        private boolean smokingAllowed;
        private boolean eventsAllowed;
        private String additionalRules;

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withPetsAllowed(boolean petsAllowed) {
            this.petsAllowed = petsAllowed;
            return this;
        }

        public Builder withSmokingAllowed(boolean smokingAllowed) {
            this.smokingAllowed = smokingAllowed;
            return this;
        }

        public Builder withEventsAllowed(boolean eventsAllowed) {
            this.eventsAllowed = eventsAllowed;
            return this;
        }

        public Builder withAdditionalRules(String additionalRules) {
            this.additionalRules = additionalRules;
            return this;
        }

        public Rules build() {
            Rules rules = new Rules();
            rules.setId(id);
            rules.setPetsAllowed(petsAllowed);
            rules.setSmokingAllowed(smokingAllowed);
            rules.setEventsAllowed(eventsAllowed);
            rules.setAdditionalRules(additionalRules);
            return rules;
        }
    }
}
