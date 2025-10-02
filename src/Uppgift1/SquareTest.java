package Uppgift1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {


    @Test
    public void getCircumferenceTest(){
        Square square = new Square(4,3);
        assertEquals(14, square.getCircumference());
    }

    @Test
    public void getAreaTest(){
        Square square = new Square(0,1);
        assertEquals(0,square.getArea());
    }

}
