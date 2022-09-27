package de.hebk;

public class Nutztier extends Haustier{

    /**
     * Beziehung zu Mitarbeiter
     */
    private Mitarbeiter meinMitarbeiter;

    /**
     * Beziehung zu Box
     */
    private Box meineBox;

    private int id;

    public  Nutztier(int pID){
        setId(pID);
    }

    public String toString(){
        return "Das ist Nutztier mit der ID: " + getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int pId){
        this.id = pId;
    }


}
