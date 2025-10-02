package Uppgift1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void getCircumferenceTest(){
        Triangle triangle = new Triangle(5,7);
        assertEquals(21, triangle.getCircumference());
    }

    @Test
    public void getAreaTest(){
        Triangle triangle = new Triangle(2,2);
        assertEquals(2, triangle.getArea());
    }
}
