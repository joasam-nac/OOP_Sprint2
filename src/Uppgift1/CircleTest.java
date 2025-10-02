package Uppgift1;

import org.junit.Test;

import static java.lang.Math.PI;
import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void getCircumferenceTest(){
        Circle circle = new Circle(10);
        assertEquals((int) (2*PI*10), circle.getCircumference());
    }

    @Test
    public void getAreaTest(){
        Circle circle = new Circle(1);
        assertEquals((int)PI, circle.getArea());
    }
}
