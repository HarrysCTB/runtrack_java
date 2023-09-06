public class BanqueTest {
    private int solde;
    public static void main(String[] args) {
        BanqueTest object = new BanqueTest(100);
        object.afficher();
        object.ajouter(50);
        object.retirer(70);
        object.retirer(90);

    }

    public BanqueTest(int solde) {
        this.solde = solde;
    }

    public void ajouter(int value) {
        solde = solde + value;
        System.out.print(value + "€ déposés. Nouveau solde: " + solde + "€\n");
    }

    public void afficher() {
        System.out.print("Solde actuel: " + solde + "€\n");
    }

    public void retirer(int value) {
        if (value > solde) {
            System.out.print("Tentative de retrait de " + value + "€... Solde insuffisant!\n");
        }
        else {
            solde = solde - value;
            System.out.print(value + "€ retirés. Nouveau solde: " + solde + "€\n");
        }
    }
}
