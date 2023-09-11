import java.util.concurrent.TimeUnit;

class myThread extends Thread {
    @Override
    public void run() { // initialisation de la méthode qui contient mon code
        myFunc();
    }

    public void myFunc() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Salut du thread!");
            try {
                TimeUnit.SECONDS.sleep(1);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SimpleThreadExercice {
    public static void main(String[] args) {
        myThread instanceThread = new myThread();
        instanceThread.start();
    }
}