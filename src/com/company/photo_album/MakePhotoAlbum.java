package com.company.photo_album;

import com.company.photo_album.photos.Photo;

import java.util.AbstractList;

public interface MakePhotoAlbum {
    AbstractList<Photo> addPhoto();

    void giveNameToPhotoByIndex();

}
