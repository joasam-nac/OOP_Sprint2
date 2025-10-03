package Uppgift2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BilTest {
    @Test
    public void getAntalMilTest(){
        Bil bil = new Bil(1000, 500, 200);
        assertEquals(500, bil.getAntalMil());
    }

    @Test
    public void getFörbrukningTest(){
        Bil bil = new Bil(1000, 500, 200);
        assertEquals(5/2, bil.getFörbrukning());
    }

    @Test
    public void toStringTest(){
        Bil bil = new Bil(2487, 1000, 1235.4);
        String testString = "Antal körda mil: 1487.0\nAntal liter bensin: 1235.4\nFörbrukning per mil: 0.83";
        assertEquals(testString, bil.toString());
    }
}
