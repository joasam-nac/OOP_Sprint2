package Uppgift1;

import static java.lang.Math.PI;

public class Circle implements Figure {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public int getCircumference() {
        return (int) (2*PI*radius);
    }

    @Override
    public int getArea() {
        return (int)(PI*radius*radius);
    }
}
