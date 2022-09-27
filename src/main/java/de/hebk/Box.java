package de.hebk;

public class Box {

    private int boxnummer;
    private int boxflaeche;

    /**
     * Beziehung Nutztier
     */
    private Nutztier[] meineNutztiere;


    public Nutztier getTier(int pTierID){
        return meineNutztiere[pTierID];
    }

    public void setTier(int pTierID, Nutztier pTier) {
        meineNutztiere[pTierID] = pTier;
    }
}
