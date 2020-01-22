package com.company.photo_album.photos;

import java.util.Objects;

public class Photo extends PhotosQuantity {
    //region Propertys

    private String name;
    private String photographerOfPhoto;

    //endregion

    //region Constructors

    public Photo(String name, String photographerOfPhoto) {
        this.name = name;
        this.photographerOfPhoto = photographerOfPhoto;
    }

    public Photo(int quantity) {
        super(quantity);
    }

    public Photo() {
    }

    //endregion

    //region Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotographerOfPhoto() {
        return photographerOfPhoto;
    }

    public void setPhotographerOfPhoto(String photographerOfPhoto) {
        this.photographerOfPhoto = photographerOfPhoto;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return Objects.equals(name, photo.name) &&
                Objects.equals(photographerOfPhoto, photo.photographerOfPhoto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, photographerOfPhoto);
    }

    @Override
    public String toString() {
        return "Photo{" +
                "name='" + name + '\'' +
                ", photographerOfPhoto='" + photographerOfPhoto + '\'' +
                '}';
    }

    //endregion
}
