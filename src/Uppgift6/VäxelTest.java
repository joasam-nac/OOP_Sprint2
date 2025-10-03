package Uppgift6;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class VäxelTest {

    @Test
    public void överTusenTest(){
        Växel v = new Växel(1002);
        int[] förväntat = new int[]{1, 0, 0, 0, 0, 0, 0, 0, 2};
        assertArrayEquals(förväntat, v.getVäxel());
    }

    @Test
    public void mellanTusenOchFemHundraTest(){
        Växel v = new Växel(789);
        int[] förväntat = new int[]{0, 1, 1, 0, 1, 1, 1, 1, 4};
        assertArrayEquals(förväntat, v.getVäxel());
    }

    @Test
    public void negativtTalTest(){
        Växel v = new Växel(-1);
        int[] förväntat = new int[9];
        assertArrayEquals(förväntat, v.getVäxel());
    }

    @Test
    public void nollTest(){
        Växel v = new Växel(0);
        int[] förväntat = new int[9];
        assertArrayEquals(förväntat, v.getVäxel());
    }

    @Test
    public void toStringÖverTusenTest(){
        Växel v = new Växel(1002);
        String förväntat = "Antal 1000-lappar: 1\nAntal 1-kronor: 2\n";
        assertEquals(förväntat, v.toString());
    }
}
