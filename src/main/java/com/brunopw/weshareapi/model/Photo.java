package com.brunopw.weshareapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "photos")
public class Photo implements Serializable {
    private static final long serialVersionUID = 5575656048363996957L;

    @Id @GeneratedValue
    private Long id;

    private String title;
    private String file;

    public Photo() {}

    public Photo(Long id, String title, String file) {
        this.id = id;
        this.title = title;
        this.file = file;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String tile) {
        this.title = tile;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", file='" + file + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String file;


        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withFile(String file) {
            this.file = file;
            return this;
        }

        public Photo build() {
            Photo photo = new Photo();
            photo.setId(id);
            photo.setFile(file);
            return photo;
        }
    }
}
