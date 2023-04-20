package com.example.wk10java;

import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class RectangleTest {

    private Rectangle rectangle;
    private Rectangle square;

    @org.junit.Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(20, 30);
        square = new Rectangle(20, 20);
    }

    @org.junit.Test
    public void setWidth() {
        rectangle.setWidth(50);
        assertEquals(50, rectangle.getWidth(), 0.0);
    }

    @org.junit.Test
    public void setWidthInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            rectangle.setHeight(0);
        });
    }

    @org.junit.Test
    public void setHeight() {
        rectangle.setHeight(50);
        assertEquals(50, rectangle.getHeight(), 0.0);
    }

    @org.junit.Test
    public void setHeightInvalid() {
        Assertions.assertThrows(IllegalArgumentException .class,()-> {
        rectangle.setHeight(0);
    });
}

    @org.junit.Test
    public void isSquare() {
        rectangle.setHeight(20);
        rectangle.setWidth(20);
    }

    @org.junit.Test
    public void isSquareFalse() {
        assertFalse(rectangle.isSquare());
        rectangle.setHeight(10);
        rectangle.setWidth(20);
    }

    @org.junit.Test
    public void isSquareTrue() {
        assertFalse(square.isSquare());
        rectangle.setHeight(20);
        rectangle.setWidth(20);
    }

    @org.junit.Test
    public void getArea() {
        assertEquals(600, rectangle.getArea(),0.0);
    }

    @org.junit.Test
    public void getAreaSquare() {
        assertEquals(400, square.getArea(), 0.0);
    }

    @org.junit.Test
    public void setWidthConstructorInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Rectangle(0,20);
        });
    }

    @org.junit.Test
    public void setHeightConstructorInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Rectangle(20, 0);
        });
    }

}