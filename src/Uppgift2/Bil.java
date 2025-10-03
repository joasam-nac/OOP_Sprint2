package Uppgift2;

public class Bil {

    private final double antalMil;
    private final double gammalAntalMil;
    private final double literBensin;

    public Bil(double milMätare, double gammalMilMätare, double literBensinIÅr){
        this.antalMil = milMätare;
        this.gammalAntalMil = gammalMilMätare;
        this.literBensin = literBensinIÅr;
    }

    public double getAntalMil() {
        return antalMil - gammalAntalMil;
    }

    public double getFörbrukning() {
       return literBensin/getAntalMil();
    }

    public String toString(){
       String text = "Antal körda mil: %.1f\nAntal liter bensin: %.1f\nFörbrukning per mil: %.2f";
       return String.format(text, getAntalMil(), literBensin, getFörbrukning());
    }
}
