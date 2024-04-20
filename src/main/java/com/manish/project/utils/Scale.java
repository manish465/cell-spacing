package com.manish.project.utils;

public class Scale {
    private double width;
    private double height;

    public Scale(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Scale{" + "width=" + width + ", height=" + height + '}';
    }
}
