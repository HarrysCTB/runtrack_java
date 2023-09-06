import java.util.Scanner;

public class Calculatrice {
    private double value1;
    private double value2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier nombre: ");
        double firstValue = scanner.nextDouble();
        System.out.print("Entrez le deuxième nombre: ");
        double secondValue = scanner.nextDouble();

        Calculatrice object = new Calculatrice(firstValue, secondValue);
        object.additionner();
        object.soustraire();
        object.produit();
        object.division();
    }

    public Calculatrice(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void additionner() {
        double somme = value1 + value2;
        System.out.print("Somme: " + somme + "\n");
    }

    public void soustraire() {
        double difference = value1 - value2;
        System.out.print("Différence: " + difference + "\n");
    }

    public void produit() {
        double produit = value1 * value2;
        System.out.print("Produit: " + produit + "\n");
    }

    public void division() {
        double division = value1 / value2;
        System.out.print("Division: " + division + "\n");
    }
}
