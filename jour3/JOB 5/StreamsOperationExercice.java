import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperationExercice {
    public static void main(String[] args) {
        List<Integer> mylist = List.of(2, 4, 6, 3, 8);

        List<Integer> result = mylist.stream()
                .map(nbr -> nbr * 2)
                .filter(nbr -> nbr > 10)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}