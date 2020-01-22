package com.company.photo_album;

import com.company.photo_album.photos.Photo;
import com.company.photo_album.photos.Printable;

import java.util.ArrayList;
import java.util.Objects;

public class PhotoAlbum implements MakePhotoAlbum, Printable {
    //region Propertys

    private ArrayList<Photo> photoAlbum;
    private String photoAlbumName;

    //endregion

    //region Constructors

    public PhotoAlbum(ArrayList<Photo> photoAlbum, String photoAlbumName) {
        this.photoAlbum = photoAlbum;
        this.photoAlbumName = photoAlbumName;
    }

    public PhotoAlbum(String photoAlbumName) {
        this.photoAlbumName = photoAlbumName;
    }

    public PhotoAlbum() {
    }

    //endregion

    //region Public Methods

    @Override
    public ArrayList<Photo> addPhoto() {
        photoAlbum = new ArrayList<>();
        Photo photo1 = new Photo("Sunshine", "Arman");
        Photo photo2 = new Photo("Lady", "Sergey");
        Photo photo3 = new Photo("Fish and man", "Paul");
        Photo photo4 = new Photo("Moon", "Leo");
        Photo photo5 = new Photo("Seaside", "Mary");
        Photo photo6 = new Photo("Leopard", "Mike");
        photoAlbum.add(photo1);
        photoAlbum.add(photo2);
        photoAlbum.add(photo3);
        photoAlbum.add(photo4);
        photoAlbum.add(photo5);
        photoAlbum.add(photo6);
        return photoAlbum;
    }

    @Override
    public void giveNameToPhotoByIndex() {
        System.out.println("                       " + getPhotoAlbumName());
        for (int i = 0; i < photoAlbum.size(); i++) {
            System.out.println("                       " + i + ") " + photoAlbum.get(i).getName());
        }
    }

    @Override
    public void printQuantityOfPhothos() {
        Photo photo = new Photo(photoAlbum.size());
        System.out.println("            The quantity of photoalbums photo is " + photo.getQuantity() + ".");
    }

    //endregion

    //region Getter and Setter

    public ArrayList<Photo> getPhotoAlbum() {
        return photoAlbum;
    }

    public void setPhotoAlbum(ArrayList<Photo> photoAlbum) {
        this.photoAlbum = photoAlbum;
    }

    public String getPhotoAlbumName() {
        return photoAlbumName;
    }

    public void setPhotoAlbumName(String photoAlbumName) {
        this.photoAlbumName = photoAlbumName;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoAlbum that = (PhotoAlbum) o;
        return Objects.equals(photoAlbum, that.photoAlbum) &&
                Objects.equals(photoAlbumName, that.photoAlbumName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(photoAlbum, photoAlbumName);
    }

    @Override
    public String toString() {
        return "PhotoAlbum{" +
                "photoAlbum=" + photoAlbum +
                ", photoAlbumName='" + photoAlbumName + '\'' +
                '}';
    }

    //endregion
}
