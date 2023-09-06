public class VoitureTest {

    private int vitesse;
    private String marque;
    private String couleur;
    public static void main(String[] args) {
        VoitureTest object = new VoitureTest(30, "Audi", "Bleu");
        object.demarrer();
        object.accelerer();
        object.accelerer();
        object.frein();
    }

    public VoitureTest(int vitesse, String marque, String couleur) {
        this.vitesse = vitesse;
        this.marque = marque;
        this.couleur = couleur;
    }

    public void demarrer() {
        System.out.print("La voiture démarre");
    }

    public void accelerer() {
        vitesse = vitesse + 10;
        System.out.print("La vitesse est maintenant de " + vitesse + "km/h.");
    }

    public void frein() {
        vitesse = 0;
        System.out.print("La voiture s'arrête. Vitesse réinitialisée à 0 km/h.");
    }
}
