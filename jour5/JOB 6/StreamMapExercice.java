import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExercice {

    public static void main(String[] args) {
        List<String> noms = Arrays.asList(args);

        List<String> nomsEnMajuscules = noms.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(nomsEnMajuscules);
    }
}
