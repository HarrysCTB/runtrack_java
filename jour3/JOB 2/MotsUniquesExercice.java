import java.util.*;

public class MotsUniquesExercice {

    public static List<String> motsUniques(List<String> listeMots) {
        Map<String, Integer> compteur = new HashMap<>();
        for (String mot : listeMots) {
            compteur.put(mot, compteur.getOrDefault(mot, 0) + 1);
        }
        List<String> motsUniques = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : compteur.entrySet()) {
            if (entry.getValue() == 1) {
                motsUniques.add(entry.getKey());
            }
        }
        return motsUniques;
    }

    public static void main(String[] args) {
        List<String> listeMots = Arrays.asList("chat", "chien", "chat", "oiseau", "poisson", "oiseau");
        List<String> motsUniques = motsUniques(listeMots);
        System.out.println("Mots uniques: " + motsUniques);
    }
}
