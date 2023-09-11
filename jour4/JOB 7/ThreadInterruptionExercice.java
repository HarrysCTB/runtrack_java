class SleeperThread implements Runnable {
    private int sleepTime;

    public SleeperThread(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(sleepTime * 1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrompu après " + sleepTime / 2 + " secondes!");
        }
    }
}

public class ThreadInterruptionExercice {
    public static void main(String[] args) {
        int sleepTime = Integer.parseInt(args[0]);
        Thread sleeperThread = new Thread(new SleeperThread(sleepTime));

        sleeperThread.start();

        try {
            Thread.sleep(sleepTime * 1000 / 2);
            sleeperThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
