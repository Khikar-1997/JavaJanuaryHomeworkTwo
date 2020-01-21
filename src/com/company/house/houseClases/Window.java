package com.company.house.houseClases;

import java.util.Objects;

public class Window extends HouseStructure {
    //region Propertys
    private String colorOfWindow;
    private double heigth;
    private double width;
    //endregion

    //region Constructors

    public Window(int quantity, String colorOfWindow, double heigth, double width) {
        super(quantity);
        this.colorOfWindow = colorOfWindow;
        this.heigth = heigth;
        this.width = width;
    }

    public Window(String colorOfWindow, double heigth, double width) {
        this.colorOfWindow = colorOfWindow;
        this.heigth = heigth;
        this.width = width;
    }

    public Window(int quantity) {
        super(quantity);
    }

    public Window() {
    }

    //endregion

    //region Getter and Setter
    public String getColorOfWindow() {
        return colorOfWindow;
    }

    public void setColorOfWindow(String colorOfWindow) {
        this.colorOfWindow = colorOfWindow;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    //endregion

    //region equals,hashCode and toString Public Methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Window window = (Window) o;
        return Double.compare(window.heigth, heigth) == 0 &&
                Double.compare(window.width, width) == 0 &&
                Objects.equals(colorOfWindow, window.colorOfWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), colorOfWindow, heigth, width);
    }

    @Override
    public String toString() {
        return "Window{" +
                "colorOfWindow='" + colorOfWindow + '\'' +
                ", heigth=" + heigth +
                ", width=" + width +
                '}';
    }
    //endregion
}

