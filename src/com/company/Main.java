package com.company;

import com.company.photo_album.PhotoAlbum;

public class Main {

    public static void main(String[] args) {
        PhotoAlbum photoAlbum = new PhotoAlbum("The nice World Earth");
        photoAlbum.addPhoto();
        photoAlbum.giveNameToPhotoByIndex();
        photoAlbum.printQuantityOfPhothos();
    }
}
