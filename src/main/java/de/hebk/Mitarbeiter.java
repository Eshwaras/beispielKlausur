package de.hebk;

import java.util.Arrays;

public class Mitarbeiter {

    /**
     * Name des Mitarbeiters
     */
    private String name;

    /**
     * gerichtete Assoziation zu Nutztieren
     */
    private Nutztier[] nutztiere;

    /**
     * Konstruktor Mitarbeiter
     * @param pName
     */
    public Mitarbeiter(String pName){
        setName(pName);
    }

    /**
     * Fuettert alle Tiere des Mitarbeiters. Dazu werden alle Tiere mit der ID einmal ausgegeben.
     */
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

    /**
     * Gibt den Mitarbeiter als String aus
     * @return Mitarbeiter als String inklusive Nutztiere
     */
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

    /**
     * Setzt den Namen des Mitarbeiters
     * @return Name des Mitarbeiters
     */
    public String getName() {
        return name;
    }

    /**
     * Gibt den Namen des Mitarbeiters zurück
     * @param name des Mitarbeiters
     */
    public void setName(String name) {
        this.name = name;
    }
}
