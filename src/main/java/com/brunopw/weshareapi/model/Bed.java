package com.brunopw.weshareapi.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "beds")
public class Bed implements Serializable {
    private static final long serialVersionUID = 5606679921815110813L;

    @Id @GeneratedValue
    private Long id;
    private BedType bedType;
    private double rentPrice;
    private double securityDepositPrice;
    @ManyToOne(fetch = FetchType.LAZY)
    private User occupant;

    public Bed() {}

    public Bed(Long id, BedType bedType, double rentPrice, double securityDepositPrice, User occupant) {
        this.id = id;
        this.bedType = bedType;
        this.rentPrice = rentPrice;
        this.securityDepositPrice = securityDepositPrice;
        this.occupant = occupant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BedType getBedType() {
        return bedType;
    }

    public void setBedType(BedType bedType) {
        this.bedType = bedType;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public double getSecurityDepositPrice() {
        return securityDepositPrice;
    }

    public void setSecurityDepositPrice(double securityDepositPrice) {
        this.securityDepositPrice = securityDepositPrice;
    }

    public User getOccupant() {
        return occupant;
    }

    public void setOccupant(User occupant) {
        this.occupant = occupant;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "id=" + id +
                ", bedType=" + bedType +
                ", rentPrice=" + rentPrice +
                ", securityDepositPrice=" + securityDepositPrice +
                ", occupant=" + occupant +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private BedType bedType;
        private double rentPrice;
        private double securityDepositPrice;
        private User occupant;

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withBedType(BedType bedType) {
            this.bedType = bedType;
            return this;
        }

        public Builder withRentPrice(double rentPrice) {
            this.rentPrice = rentPrice;
            return this;
        }

        public Builder withSecurityDepositPrice(double securityDepositPrice) {
            this.securityDepositPrice = securityDepositPrice;
            return this;
        }

        public Builder withOccupant(User occupant) {
            this.occupant = occupant;
            return this;
        }

        public Bed build() {
            Bed bed = new Bed();
            bed.setId(id);
            bed.setBedType(bedType);
            bed.setRentPrice(rentPrice);
            bed.setSecurityDepositPrice(securityDepositPrice);
            bed.setOccupant(occupant);
            return bed;
        }
    }
}
