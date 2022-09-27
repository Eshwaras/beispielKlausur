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

    /**
     * ID des Nutztiers
     */
    private int id;

    /**
     * Konstruktor Nutztier
     * @param pID ID des neuen Nutztiers
     */
    public  Nutztier(int pID){
        setId(pID);
    }

    /**
     * Gibt das Nutztier als String aus
     * @return Nutztier als String
     */
    public String toString(){
        return "Das ist Nutztier mit der ID: " + getId();
    }

    /**
     * Gibt die MitarbeiterID zurück
     * @return MitarbeiterID
     */
    public int getId() {
        return id;
    }

    /**
     * Setzt ID eines Mitarbeiters
     * @param pId neue MitarbeiterID
     */
    public void setId(int pId){
        this.id = pId;
    }


}
