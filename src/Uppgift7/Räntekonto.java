package Uppgift7;

import java.util.Locale;

public class Räntekonto {
    private final double ränta;
    private final double startKapital;
    private final int år;

    Räntekonto(double ränta, double startKapital, int år){
        this.ränta = ränta;
        this.startKapital = startKapital;
        this.år = år;
    }

    private double getRäntaFrånÅr(int årtal){
        return Math.pow(1+ränta, årtal)*startKapital;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(" År\t    Summa\n----------------");
        for(int i = 1; i<=år; i++){
            String årsRänta = String.format(Locale.GERMANY, "%.2f", getRäntaFrånÅr(i));
            sb.append("\n " + i + "\t  " + årsRänta + " kr");
        }
        return sb.toString();
    }
}
