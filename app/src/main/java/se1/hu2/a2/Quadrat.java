package se1.hu2.a2;

public class Quadrat extends Figurenverwalter {

    public Quadrat(int a) {
        this.a = a;
    }

    @Override
    public void skalieren(double faktor) {
        a *= faktor;
    }

    @Override
    public double getFlaeche() {
        return a * a;
    }

}
