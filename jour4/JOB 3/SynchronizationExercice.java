import java.util.concurrent.TimeUnit;

class BankAccount {
    private int solde;

    public BankAccount(int soldeInitial) {
        this.solde = soldeInitial;
    }

    public synchronized void remove(int value) {
        if (value <= solde) {
            solde -= value;
            System.out.println(Thread.currentThread().getName() + " a retiré " + value + ".");
        } else {
            System.out.println(Thread.currentThread().getName() + " : Solde insuffisant pour le retrait de " + value + ".");
        }
    }

    public int getSolde() {
        return solde;
    }
}

class RemoveThread implements Runnable {
    private BankAccount account;
    private int value;

    public RemoveThread(BankAccount account, int value) {
        this.account = account;
        this.value = value;
    }

    @Override
    public void run() {
        account.remove(value);
    }
}


public class SynchronizationExercice {
    public static void main(String[] args) {
        int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);
        BankAccount account = new BankAccount(value1);

        Thread thread1 = new Thread(new RemoveThread(account, value2), "Thread-1");
        Thread thread2 = new Thread(new RemoveThread(account, value2), "Thread-2");

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Solde final: " + account.getSolde() + ".");
    }
}
