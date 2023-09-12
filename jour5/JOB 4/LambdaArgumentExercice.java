import java.util.function.Predicate;

public class LambdaArgumentExercice {

    public static void main(String[] args) {
        Predicate<String> check = str -> str.length() > Integer.parseInt(args[1]);

        if (check.test(args[0])) {
            System.out.println("La chaîne " + args[0] + " a une longueur supérieure à " + Integer.parseInt(args[1]) + ".");
        } else {
            System.out.println("La chaîne " + args[0] + " a une longueur inférieure à " + Integer.parseInt(args[1]) + ".");
        }
    }
}

