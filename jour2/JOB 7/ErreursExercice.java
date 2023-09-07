public class ErreursExercice {
    public static void main(String[] args) {
        try {
            String str = null;
            int longueur = str.length();
        } catch (NullPointerException e) {
            System.out.println("Une NullPointerException s'est produite : " + e.getMessage());
        }

        try {
            int[] tableau = {1, 2, 3};
            int valeur = tableau[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Une ArrayIndexOutOfBoundsException s'est produite : " + e.getMessage());
        }

        try {
            int dividende = 10;
            int diviseur = 0;
            int resultat = dividende / diviseur;
        } catch (ArithmeticException e) {
            System.out.println("Une ArithmeticException s'est produite : " + e.getMessage());
        }
    }
}
