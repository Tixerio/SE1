package se1.hu2.a2;

import java.util.ArrayList;
import java.util.List;


public class Figurenverwalter implements Figuren{

    private static List<Figuren> figuren = new ArrayList<>();



    double a;
    double b;



    @Override
    public void skalieren(double faktor){

        a *= faktor;
        b *= faktor;
    }

    @Override
    public double getFlaeche() {
        return a*b;
    }

    public void figurHinzufuegen(Figurenverwalter figur) {
        figuren.add(figur);
    }


    public static void main(String[] args) {
        Figurenverwalter verwalter = new Figurenverwalter();

        Kreis k = new Kreis(7);
        verwalter.figurHinzufuegen(k);

        Quadrat q = new Quadrat(4);
        verwalter.figurHinzufuegen(q);

        Rechteck re1 = new Rechteck(2, 5);
        verwalter.figurHinzufuegen(re1);

        Rechteck re2 = new Rechteck(2, 5);
        re2.skalieren(2);
        verwalter.figurHinzufuegen(re2);

        figuren.stream().mapToDouble(Figuren::getFlaeche).forEach(System.out::println);

        System.out.printf("Gesamtfläche %f", k.getFlaeche() + q.getFlaeche() + re1.getFlaeche() + re2.getFlaeche());
    }
}
