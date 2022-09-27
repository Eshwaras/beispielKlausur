package de.hebk;

import java.util.Arrays;

public class Mitarbeiter {

    private String name;

       /**
     * gerichtete Assoziation zu Nutztieren
     */
    private Nutztier[] nutztiere;

    public Mitarbeiter(String pName){
        setName(pName);
    }

    public void fuettern(){
        for (int i= 0; i< nutztiere.length; i++){
            System.out.print("Tier mit der ID " + nutztiere[i].getId() + " wurde gefüttert\n");
        }
    }

    /**
     * Fügt dem Mitarbeiter ein Nutztier hinzu
     * @param pNutztier das Nutztier wird hinzugefügt
     */
    public void addNutztier(Nutztier pNutztier){
        // 1. Nutztier hinzufügen
        if (nutztiere == null){
            nutztiere = new Nutztier[1];
        }else {
            // 2. Array vergrößern
            nutztiere = Arrays.copyOf(nutztiere, nutztiere.length + 1);
        }
        for (int i = 0; i <= nutztiere.length; i++){
            if (nutztiere[i] == null){
                nutztiere[i] = pNutztier;
                return;
            }
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        String ret = "";
        ret = ret + "Name: " + this.getName() + "\n";

        ret = ret + "Meine Nutztiere: \n";
        for(int i = 0; i < nutztiere.length; i++){
            ret = ret + nutztiere[i] + "\n";
        }
        ret = ret + "----  \n";

        return ret;
    }
}
