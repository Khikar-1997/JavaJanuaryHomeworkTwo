package com.company.photo_album.photos;

import java.util.Objects;

public abstract class PhotosQuantity {
    //region Propertys

    private int quantity;

    //endregion

    //region Constructors


    public PhotosQuantity(int quantity) {
        this.quantity = quantity;
    }

    public PhotosQuantity() {
    }
    //endregion

    //region Getter and Setter

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("The photoalbum have not any phothos");
        }
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotosQuantity that = (PhotosQuantity) o;
        return quantity == that.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity);
    }

    @Override
    public String toString() {
        return "PhotosQuantity{" +
                "quantity=" + quantity +
                '}';
    }

    //endregion
}
