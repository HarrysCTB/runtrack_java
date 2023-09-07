public class VoitureExercice {

    private int vitesse;
    private String marque;
    private String couleur;
    public static void main(String[] args) {
        VoitureExercice object = new VoitureExercice(Integer.parseInt(args[0]), "Audi", "Bleu");
        try {
            object.demarrer();
            object.accelerer();
            object.accelerer();
            object.frein();
        } catch (VitesseLimiteDepasseeException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }

    public VoitureExercice(int vitesse, String marque, String couleur) {
        this.vitesse = vitesse;
        this.marque = marque;
        this.couleur = couleur;
    }

    public void demarrer() {
        System.out.println("La voiture démarre");
    }

    public void accelerer() throws VitesseLimiteDepasseeException {
        vitesse = vitesse + 10;
        if (vitesse > 100) {
             throw new VitesseLimiteDepasseeException("VitesseLimiteDepasseeException");
        }
        System.out.println("La vitesse est maintenant de " + vitesse + "km/h.");
    }

    public void frein() {
        vitesse = 0;
        System.out.println("La voiture s'arrête. Vitesse réinitialisée à 0 km/h.");
    }
}