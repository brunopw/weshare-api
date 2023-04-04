package com.brunopw.weshareapi.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {
    private static final long serialVersionUID = 5806666301672129669L;

    @Id @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String name;
    @OneToOne(fetch = FetchType.EAGER)
    private Photo photo;
    private String passport;
    private String phoneNumber;
    private String birthday;
    private UserType userType;

    public User() {}

    public User(Long id, String username, String password, String name, Photo photo, String passport, String phoneNumber, String birthday, UserType userType) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.photo = photo;
        this.passport = passport;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.userType = userType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", passport='" + passport + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthday='" + birthday + '\'' +
                ", userType=" + userType +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String username;
        private String password;
        private String name;
        private Photo photo;
        private String passport;
        private String phoneNumber;
        private String birthday;
        private UserType userType;


        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPhoto(Photo photo) {
            this.photo = photo;
            return this;
        }

        public Builder withPassport(String passport) {
            this.passport = passport;
            return this;
        }

        public Builder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder withUserType(UserType userType) {
            this.userType = userType;
            return this;
        }

        public User build() {
            User user = new User();
            user.setId(id);
            user.setUsername(username);
            user.setPassword(password);
            user.setName(name);
            user.setPhoto(photo);
            user.setPassport(passport);
            user.setPhoneNumber(phoneNumber);
            user.setBirthday(birthday);
            user.setUserType(userType);
            return user;
        }
    }
}
