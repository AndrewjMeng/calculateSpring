package com.example.calculateSpring;

public class MathVolume {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String buildVolume() {
        int volumeXY = Math.multiplyExact(getX(),getY());
        int volumeXYZ = Math.multiplyExact(volumeXY, getZ());
        if((getX() == getY() && (getX() == getZ()))) {
            return "The volume of a " +getX()+"x"+getY()+"x"+getZ()+ " square is " +volumeXYZ;
        } else {
            return "The volume of a " +getX()+"x"+getY()+"x"+getZ()+ " rectangle is " +volumeXYZ;
        }
    }
}
