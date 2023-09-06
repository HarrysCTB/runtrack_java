import java.util.Scanner;

public class HelloWorld {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Veuillez saisir votre nom:");
            String name = scanner.nextLine();
            System.out.print("Hello, " + name + "!");
            scanner.close();
    }
}
