package com.example.wk10java;

public class Rectangle {
    private double width,height;

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width>0)
            this.width = width;
        else
            throw new IllegalArgumentException("Invalid");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height>0)
            this.height = height;
        else
            throw new IllegalArgumentException("Invalid");
    }

    public boolean isSquare() {
        return true;
    }

    public double getArea() {
        return width * height;
    }
}

