package Uppgift6;

public class Växel {
    private static final int[] VÄRDEN = {1000, 500, 200, 100, 50, 20, 10, 5, 1};
    private final int pengar;
    private final int[] uppdelning;

    public Växel(int pengar) {
        this.pengar = pengar;
        uppdelning = new int[VÄRDEN.length];
        if (pengar <= 0) {
            return;
        }

        for (int i = 0; i < VÄRDEN.length; i++) {
            int note = VÄRDEN[i];
            int count = pengar / note;
            if (count > 0) {
                uppdelning[i] = count;
                pengar %= note;
            }
        }
    }

    public int[] getVäxel() {
        return uppdelning.clone();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < VÄRDEN.length; i++) {
            if (uppdelning[i] > 0) {
                if (VÄRDEN[i] > 10) {
                    sb.append("Antal ")
                            .append(VÄRDEN[i])
                            .append("-lappar: ")
                            .append(uppdelning[i])
                            .append("\n");
                } else {
                    sb.append("Antal ")
                            .append(VÄRDEN[i])
                            .append("-kronor: ")
                            .append(uppdelning[i])
                            .append("\n");
                }
            }
        }
        return sb.toString();
    }
}