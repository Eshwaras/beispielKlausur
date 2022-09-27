package de.hebk;

public class Schaf extends Nutztier{

    private String rasse;

    public Schaf(int pID, String rasse) {
        super(pID);
        this.rasse = rasse;
    }

    public int scheren(){
        return -1;
    }
}
