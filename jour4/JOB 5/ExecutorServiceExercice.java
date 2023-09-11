import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class myMultiplicator implements Runnable {
    private final int baseNumber;
    private final int factor;

    public myMultiplicator(int baseNumber, int factor) {
        this.baseNumber = baseNumber;
        this.factor = factor;
    }

    @Override
    public void run() {
        int result = baseNumber * factor;
        System.out.println("Résultat de la tâche " + baseNumber + ": " + result);
    }
}

public class ExecutorServiceExercice {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(Integer.parseInt(args[0]));

        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
            Runnable tthread = new myMultiplicator(i, 3);
            executor.execute(tthread);
        }
        executor.shutdown();
    }
}

