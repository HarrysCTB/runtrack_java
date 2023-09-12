import java.util.HashSet;

public class HashSetArgumentExercice {
    public static void main(String[] args) {
        HashSet<String> argumentsSet = new HashSet<>();
        for (String arg : args) {
            argumentsSet.add(arg);
        }
        for (String arg : argumentsSet) {
            System.out.println(arg);
        }
    }
}
