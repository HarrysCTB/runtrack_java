import java.util.concurrent.*;

class multiplication implements Callable<Integer> {
    private final int num1;
    private final int num2;

    public multiplication(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public Integer call() throws Exception {
        return num1 * num2;
    }
}

public class CallableFutureExercice {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> multiplication = new multiplication(num1, num2);

        Future<Integer> futureResult = executor.submit(multiplication);

        try {
            int result = futureResult.get();
            System.out.println("Résultat de la multiplication est: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}

