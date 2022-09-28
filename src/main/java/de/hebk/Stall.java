package de.hebk;

public class Stall{

    /**
     * Komposition zu Box
     */
    private Box[] unsereBox;
    /**
     *  Komposition ->
     *  1. private
     *  2. Initialisierung im Konstruktor
     *  3. Hinzufügen und Entfernen von Elemente bzw. allgemeines Bearbeiten des Attributes nur
     *  über Hilfsmethoden (keine klassischen getter/setter Methoden)
     */


    private int stallnummer;

    public Stall(int pBoxGroesse,int stallnummer) {
        this.unsereBox = new Box[pBoxGroesse];
        this.stallnummer = stallnummer;
    }

    public Nutztier getTierBox(int pBoxID, int pTierID){
        return unsereBox[pBoxID].getTier(pTierID);
    }


    public void addTier(int pBoxID, int pTierID, Nutztier pTier){
                unsereBox[pBoxID].setTier(pTierID, pTier);
    }


}
