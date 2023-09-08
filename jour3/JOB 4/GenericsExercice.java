 class Boite<T> {
    private T contenu;

    public void addBox(T nouvelElement) {
        this.contenu = nouvelElement;
    }

    public T getBox() {
        return contenu;
    }
}

public class GenericsExercice {
    public static void main(String[] args) {
        Boite<String> boiteString = new Boite<>();
        boiteString.addBox(args[0]);
        String contenuString = boiteString.getBox();
        System.out.println("Contenu de la boite: " + contenuString);
    }
}

