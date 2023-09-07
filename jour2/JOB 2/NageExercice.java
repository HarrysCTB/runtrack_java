interface Nageur {
    void nager();
}

class Homme implements Nageur {
    @Override
    public void nager() {
        System.out.println("L'homme nage.");
    }
}

class Poisson implements Nageur {
    @Override
    public void nager() {
        System.out.println("Le poisson nage rapidement.");
    }
}

public class NageExercice {
    public static void main(String[] args) {
        Nageur instance1 = new Homme();
        Nageur instance2 = new Poisson();

        instance1.nager();
        instance2.nager();
    }
}
