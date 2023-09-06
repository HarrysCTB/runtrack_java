import java.util.Random;

public class JeuDeDes {
    public static void main(String[] args) {
        Random random = new Random();
        int rand1 = random.nextInt(6) + 1;
        int rand2 = random.nextInt(6) + 1;

        int result = rand1 + rand2;
        System.out.print("Dé 1: " + rand1 + "\n" + "Dé 2: " + rand2 + "\n" + "Somme: " + result);
    }
}
