abstract class Animal {
    abstract void faireDuBruit();
}

class Chat extends Animal {
    void faireDuBruit() {
        System.out.println("Le chat miaule.");
    }
}

class Chien extends Animal {
    void faireDuBruit() {
        System.out.println("Le chien aboie.");
    }
}

class Oiseau extends Animal {
    void faireDuBruit() {
        System.out.println("L'oiseau chante.");
    }
}

public class AnimalExercice {
    public static void main(String[] args) {
        Animal chat = new Chat();
        Animal chien = new Chien();
        Animal oiseau = new Oiseau();

        chat.faireDuBruit();
        chien.faireDuBruit();
        oiseau.faireDuBruit();
    }
}