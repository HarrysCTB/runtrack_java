import java.util.*;

public class EtudiantsMapExercice {

    public static void main(String[] args) {
        Map<Integer, String> etudiants = new HashMap<>();
        etudiants.put(102, "Marie");
        etudiants.put(103, "Jean");
        etudiants.put(101, "Pierre");
        TreeMap<Integer, String> etudiantsTries = new TreeMap<>(etudiants);
        for (Map.Entry<Integer, String> entry : etudiantsTries.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
