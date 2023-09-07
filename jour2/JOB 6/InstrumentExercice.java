interface Instrument {
    void jouer();
}

class Guitare implements Instrument {
    @Override
    public void jouer() {
        System.out.println("La guitare joue un air rock.");
    }
}

class Piano implements Instrument {
    @Override
    public void jouer() {
        System.out.println("Le piano joue une mélodie douce.");
    }
}

public class InstrumentExercice {
    public static void main(String[] args) {
        Instrument instance1 = new Guitare();
        Instrument instance2 = new Piano();

        instance1.jouer();
        instance2.jouer();
    }
}