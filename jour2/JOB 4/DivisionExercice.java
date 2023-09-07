public class DivisionExercice {

    public static double diviser(double numerateur, double denominateur) throws DivisionParZeroException {
        if (denominateur == 0) {
            throw new DivisionParZeroException("DivisionParZeroException.");
        }
        return numerateur / denominateur;
    }

    public static void main(String[] args) {
        try {
            double resultat = diviser(Double.parseDouble(args[0]) ,Double.parseDouble(args[1]));
            System.out.println("Résultat : " + resultat);
        } catch (DivisionParZeroException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}