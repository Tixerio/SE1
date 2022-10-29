package se1.hu2.a2;

public class Rechteck extends Figurenverwalter{

    public Rechteck(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void skalieren(double faktor) {
        a *= faktor;
        b *= faktor;
    }

    @Override
    public double getFlaeche() {
        return a * b;
    }
}
