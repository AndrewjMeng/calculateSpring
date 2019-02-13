package com.example.calculateSpring;

public class MathArea {
    private String type;
    private int radius;
    private int width;
    private int height;

    public void setType(String type) {
        this.type = type;
    }

    public void setRadius(String radius) {
        this.radius = Integer.parseInt(radius);
    }

    public void setWidth(String width) {
        this.width = Integer.parseInt(width);
    }

    public void setHeight(String height) {
        this.height = Integer.parseInt(height);
    }
    public String buildArea(){
        String resultString = "Invalid";
        if(type.equals("circle") && radius > 0) {
            double area = (Math.PI * (radius *radius));
            resultString = String.format("Area of a circle with a radius of %d is %.5f",radius, area);
        }
        if(type.equals("rectangle") && width > 0 && height > 0){
            int area = (width * height);
            resultString = "Area of a " + width + "x" + height +" rectangle is " + area;
        }
        return  resultString;
    }
}
