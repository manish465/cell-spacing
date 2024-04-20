package com.manish.project.utils;

import com.manish.project.setting.Constant;

import java.util.Random;

public class Position {
    private double x;
    private double y;

    public Position() {
        this.x = Math.random() * Constant.WINDOW_WIDTH;
        this.y = Math.random() * Constant.WINDOW_HEIGHT;
    }

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Position{" + "x=" + x + ", y=" + y + '}';
    }
}
