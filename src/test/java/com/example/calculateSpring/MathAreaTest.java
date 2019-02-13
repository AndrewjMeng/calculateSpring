package com.example.calculateSpring;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathAreaTest {
    @Test
    public void CircleInvalidTypeTest() {
        MathArea mathArea = new MathArea();
        mathArea.setType("");
        assertEquals("Invalid", mathArea.buildArea());
    }
    @Test
    public void CircleInvalidRadiusTest() {
        MathArea mathArea = new MathArea();
        mathArea.setType("circle");
        assertEquals("Invalid", mathArea.buildArea());
    }
    @Test
    public void CircleInvalidWidthTest() {
        MathArea mathArea = new MathArea();
        mathArea.setType("circle");
        mathArea.setWidth("4");
        assertEquals("Invalid", mathArea.buildArea());
    }
    @Test
    public void CircleInvalidHeightTest() {
        MathArea mathArea = new MathArea();
        mathArea.setType("circle");
        mathArea.setHeight("4");
        assertEquals("Invalid", mathArea.buildArea());
    }

    @Test
    public void CircleRadiusTest() {
        MathArea mathArea = new MathArea();
        mathArea.setType("circle");
        mathArea.setRadius("4");

        assertEquals("Area of a circle with a radius of 4 is 50.26548", mathArea.buildArea());
    }

    @Test
    public void RectangleWidthHeightTest() {
        MathArea mathArea = new MathArea();
        mathArea.setType("rectangle");
        mathArea.setWidth("4");
        mathArea.setHeight("7");

        assertEquals("Area of a 4x7 rectangle is 28", mathArea.buildArea());
    }

    @Test
    public void RectangleInvalidHeightTest() {
        MathArea mathArea = new MathArea();
        mathArea.setType("rectangle");
        mathArea.setWidth("4");

        assertEquals("Invalid", mathArea.buildArea());
    }
    @Test
    public void RectangleInvalidWidthTest() {
        MathArea mathArea = new MathArea();
        mathArea.setType("rectangle");
        mathArea.setHeight("4");

        assertEquals("Invalid", mathArea.buildArea());
    }
}
