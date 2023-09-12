import java.util.ArrayList;

public class ArrayListArgumentExercice {

    public static void main(String[] args) {
        ArrayList<String> arguments = new ArrayList<>();
        for (String arg : args) {
            arguments.add(arg);
        }
        for (String arg : arguments) {
            System.out.println(arg);
        }
    }
}
