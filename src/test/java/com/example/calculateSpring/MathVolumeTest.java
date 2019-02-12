package com.example.calculateSpring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MathVolumeTest {
    @Test
    public void mathVolumeRectangle() {
        MathVolume mathVolume = new MathVolume();
        mathVolume.setX(3);
        mathVolume.setY(4);
        mathVolume.setZ(5);
        String result = mathVolume.buildVolume();

        assertEquals("The volume of a 3x4x5 rectangle is 60", result);
    }
    @Test
    public void mathVolumeSquare() {
        MathVolume mathVolume = new MathVolume();
        mathVolume.setX(3);
        mathVolume.setY(3);
        mathVolume.setZ(3);
        String result = mathVolume.buildVolume();

        assertEquals("The volume of a 3x3x3 square is 27", result);
    }

}
