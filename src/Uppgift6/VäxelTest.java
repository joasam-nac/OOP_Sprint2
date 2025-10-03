package Uppgift6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VäxelTest {

    /*
    1000, 500, 200, 100, 50, 20, 10, 5, 1
    {x  , x  , x  , x  , x , x , x , x, x}
     */
    @Test
    public void överTusenTest(){
        Växel v = new Växel(1002);
        assertEquals(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 2}, v.getVäxel());
    }

    @Test
    public void mellanTusenOchFemHundraTest(){
        Växel v = new Växel(789);
        assertEquals(new int[]{0, 1, 1, 0, 1, 1, 1, 1, 4}, v.getVäxel());
    }

    @Test
    public void negativtTalTest(){
        Växel v = new Växel(-1);
        assertEquals(new int[9], v.getVäxel());
    }

    @Test
    public void nollTest(){
        Växel v = new Växel(0);
        assertEquals(new int[9], v.getVäxel());
    }
}
