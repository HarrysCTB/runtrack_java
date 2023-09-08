import java.util.List;

public class ListeEntiersExercice {

    public static int sommeNombresPairs(List<Integer> liste) {
        int somme = 0;

        for (int nombre : liste) {
            if (nombre % 2 == 0) {
                somme += nombre;
            }
        }
        return somme;
    }

    public static void main(String[] args) {
        List<Integer> maListe = List.of(1, 2, 3, 4, 5, 6);
        int resultat = sommeNombresPairs(maListe);
        System.out.println("Somme des nombres pairs: " + resultat);
    }
}
