package Uppgift6;

public class Växel {
    private static final int[] VÄRDEN = {1000, 500, 200, 100, 50, 20, 10, 5, 1};
    private final int pengar;
    private final int[] breakdown;

    public Växel(int pengar) {
        this.pengar = pengar;
        breakdown = new int[VÄRDEN.length];
        if (pengar <= 0) {
            return;
        }

        for (int i = 0; i < VÄRDEN.length; i++) {
            int note = VÄRDEN[i];
            int count = pengar / note;
            if (count > 0) {
                breakdown[i] = count;
                pengar %= note;
            }
        }
    }

    public int[] getVäxel() {
        return breakdown.clone();
    }
}