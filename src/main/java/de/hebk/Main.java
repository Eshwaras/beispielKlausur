package de.hebk;

public class Main {
    public static void main(String[] args) {

        Mitarbeiter test = new Mitarbeiter("Peter");

        test.addNutztier(new Kuh(1, 100));
        test.addNutztier(new Schaf(3, "Wolle"));
        test.addNutztier(new Kuh(5, 120));

        System.out.println(test);

        test.fuettern();

    }
}