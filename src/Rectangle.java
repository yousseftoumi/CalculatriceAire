public class Rectangle implements IForme
{
    private double largeur;
    private double longeur;

    public Rectangle(double largeur, double longeur) {
        this.largeur = largeur;
        this.longeur = longeur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getLongeur() {
        return longeur;
    }

    @Override
    public double aire() {
        return largeur*longeur;
    }
}
