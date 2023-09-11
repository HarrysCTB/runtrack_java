import java.util.concurrent.TimeUnit;

class myThread implements Runnable {
    @Override
    public void run() {
        myFunc();
    }

    public void myFunc() {
        for (int i = 0; i < 5; i++) {
            System.out.println("En cours d'excécution...");
            try {
                TimeUnit.SECONDS.sleep(1);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunnableInterfaceExercice {
    public static void main(String[] args) {
        myThread instanceThread = new myThread();
        Thread thread = new Thread(instanceThread);
        thread.start();
    }
}