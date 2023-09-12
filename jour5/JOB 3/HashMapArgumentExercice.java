import java.util.HashMap;

public class HashMapArgumentExercice {

    public static void main(String[] args) {
        if (args.length % 2 != 0) {
            System.out.println("Erreur : Les paires de clés et valeurs doivent être fournies.");
            return;
        }

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < args.length; i += 2) {
            String key = args[i];
            String value = args[i + 1];
            map.put(key, value);
        }
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
