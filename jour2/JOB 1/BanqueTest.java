public class BanqueTest {
    protected double solde;

    public BanqueTest(double solde) {
        this.solde = solde;
    }

    public void ajouter(double value) {
        solde = solde + value;
        System.out.print(value + "€ déposés. Nouveau solde: " + solde + "€\n");
    }

    public void afficherCourant() {
        System.out.print("Solde du compte courant: " + solde + "€\n");
    }

    public void retirer(double value) {
        if (value > solde) {
            System.out.print("Tentative de retrait de " + value + "€... Solde insuffisant!\n");
        }
        else {
            solde = solde - value;
            System.out.print(value + "€ retirés. Nouveau solde: " + solde + "€\n");
        }
    }
}
