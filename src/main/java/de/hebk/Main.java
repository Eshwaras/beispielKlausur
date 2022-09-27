package de.hebk;

public class Main {
    public static void main(String[] args) {

        Mitarbeiter test = new Mitarbeiter("Peter");

        test.addNutztier(new Nutztier(1));
        test.addNutztier(new Nutztier(3));
        test.addNutztier(new Nutztier(5));

        System.out.println(test);

        test.fuettern();

    }
}