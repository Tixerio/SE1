package se1.hu2.a2;

public class Kreis extends Figurenverwalter{

    public Kreis(int r) {
        this.r = r;
    }

    double r; //radius

    @Override
    public void skalieren(double faktor) {
        r *= faktor;
    }

    @Override
    public double getFlaeche() {
        return r * r * Math.PI;
    }



}
