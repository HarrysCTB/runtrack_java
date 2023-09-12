import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectExercice {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Veuillez fournir une valeur de seuil et au moins un nombre.");
            return;
        }
        try {
            int seuil = Integer.parseInt(args[0]);

            List<Integer> nombres = Arrays.stream(args)
                    .skip(1)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            List<Integer> nombresFiltres = nombres.stream()
                    .filter(n -> n < seuil)
                    .collect(Collectors.toList());
            System.out.println("Nombres inférieures à " + seuil + " :" + nombresFiltres);
        } catch (NumberFormatException e) {
            System.out.println("Veuillez fournir des nombres valides.");
        }
    }
}