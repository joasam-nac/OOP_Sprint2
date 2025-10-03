package Uppgift6;

public enum Kronor {
    TUSEN(1000),
    FEM_HUNDRA(500),
    TVÅ_HUNDRA(200),
    ETT_HUNDRA(100),
    FEMTIO(50),
    TJUGO(20),
    TIO(20),
    FEM(5),
    TVÅ(2),
    EN(1);

    private final int värde;

    Kronor(int värde){
        this.värde = värde;
    }

    public int getVärde(){
        return värde;
    }
}
