package de.hebk;

public class Kuh extends Nutztier{

    private int milchleistung;

    public Kuh(int pID, int milchleistung) {
        super(pID);
        this.milchleistung = milchleistung;
    }

    public int melken(){
        return -1;
    }
}
