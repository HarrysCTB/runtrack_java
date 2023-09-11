import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private int solde;
    private final Lock lock = new ReentrantLock();

    public BankAccount(int soldeInitial) {
        this.solde = soldeInitial;
    }

    public void remove(int value) {
        lock.lock();
        try {
            if (value <= solde) {
                solde -= value;
                System.out.println(Thread.currentThread().getName() + " a retiré " + value + ".");
            } else {
                System.out.println(Thread.currentThread().getName() + " : Solde insuffisant pour le retrait de " + value + ".");
            }
        } finally {
            lock.unlock();
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


public class LockExercice {
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
