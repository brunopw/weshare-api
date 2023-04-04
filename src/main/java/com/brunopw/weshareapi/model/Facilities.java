package com.brunopw.weshareapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "facilities")
public class Facilities implements Serializable {
    private static final long serialVersionUID = 8850984287663965310L;

    @Id @GeneratedValue
    private Long id;
    private boolean wifi;
    private boolean tv;
    private boolean washingMachine;
    private boolean dryer;
    private boolean dishwasher;
    private boolean garden;
    private boolean balcony;
    private boolean bbq;

    public Facilities() {}

    public Facilities(Long id, boolean wifi, boolean tv, boolean washingMachine, boolean dryer, boolean dishwasher, boolean garden, boolean balcony, boolean bbq) {
        this.id = id;
        this.wifi = wifi;
        this.tv = tv;
        this.washingMachine = washingMachine;
        this.dryer = dryer;
        this.dishwasher = dishwasher;
        this.garden = garden;
        this.balcony = balcony;
        this.bbq = bbq;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(boolean washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean isDryer() {
        return dryer;
    }

    public void setDryer(boolean dryer) {
        this.dryer = dryer;
    }

    public boolean isDishwasher() {
        return dishwasher;
    }

    public void setDishwasher(boolean dishwasher) {
        this.dishwasher = dishwasher;
    }

    public boolean isGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isBbq() {
        return bbq;
    }

    public void setBbq(boolean bbq) {
        this.bbq = bbq;
    }

    @Override
    public String toString() {
        return "Facilities{" +
                "id=" + id +
                ", wifi=" + wifi +
                ", tv=" + tv +
                ", washingMachine=" + washingMachine +
                ", dryer=" + dryer +
                ", dishwasher=" + dishwasher +
                ", garden=" + garden +
                ", balcony=" + balcony +
                ", bbq=" + bbq +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private boolean wifi;
        private boolean tv;
        private boolean washingMachine;
        private boolean dryer;
        private boolean dishwasher;
        private boolean garden;
        private boolean balcony;
        private boolean bbq;

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withWifi(boolean wifi) {
            this.wifi = wifi;
            return this;
        }

        public Builder withTv(boolean tv) {
            this.tv = tv;
            return this;
        }

        public Builder withWashingMachine(boolean washingMachine) {
            this.washingMachine = washingMachine;
            return this;
        }

        public Builder withDryer(boolean dryer) {
            this.dryer = dryer;
            return this;
        }

        public Builder withDishwasher(boolean dishwasher) {
            this.dishwasher = dishwasher;
            return this;
        }

        public Builder withGarden(boolean garden) {
            this.garden = garden;
            return this;
        }

        public Builder withBalcony(boolean balcony) {
            this.balcony = balcony;
            return this;
        }

        public Builder withBbq(boolean bbq) {
            this.bbq = bbq;
            return this;
        }

        public Facilities build() {
            Facilities facilities = new Facilities();
            facilities.setId(id);
            facilities.setWifi(wifi);
            facilities.setTv(tv);
            facilities.setWashingMachine(washingMachine);
            facilities.setDryer(dryer);
            facilities.setDishwasher(dishwasher);
            facilities.setGarden(garden);
            facilities.setBalcony(balcony);
            facilities.setBbq(bbq);
            return facilities;
        }
    }
}
