import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class BanqueExercice extends BanqueTest {
    private double tauxInterets;
    private double soldeEpargne;

    public static void main(String[] args) {
        double arg1 = Double.parseDouble(args[0]);
        double arg2 = Double.parseDouble(args[1]);
        double arg3 = Double.parseDouble(args[2]);
        BanqueExercice instance = new BanqueExercice(arg1, arg2, arg3);
        instance.afficherCourant();
        instance.afficherEpargne();
        instance.ajouterInteret();
    }

    public BanqueExercice(double solde, double soldeEpargne, double tauxInterets) {
        super(solde);
        this.soldeEpargne = soldeEpargne;
        this.tauxInterets = tauxInterets;
    }

    public void afficherEpargne() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.##", symbols);
        String formattedTauxInterets = df.format(TauxInterets);

        System.out.println("Solde du compte épargne: " + soldeEpargne + "€ avec un taux d'intérêt de " + formattedTauxInterets +  "%");
    }

    public void ajouterInteret() {
        double value = soldeEpargne * (tauxInterets / 100);
        double nouveauSolde = soldeEpargne + value;
        System.out.println("Intérêts ajoutés: " + value + "€. Nouveau solde: " + nouveauSolde +  "€");
    }
}