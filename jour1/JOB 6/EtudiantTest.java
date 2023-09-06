import java.util.*;

public class EtudiantTest {
    private String name;
    private List<Integer> marks = new ArrayList<>();
    public static void main(String[] args) {
        List<Integer> listeEntiers = List.of(15, 12, 18, 10);
        EtudiantTest object = new EtudiantTest("Abdel", listeEntiers);
        System.out.println("Nom de l'étudiant: " + object.name);
        System.out.println("Notes: " + object.marks);
        object.max();
        object.min();
        object.average();
    }

    public EtudiantTest(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public void addvalue(int value) {
        marks.add(value);
    }

    public void max() {
        System.out.println("Note la plus basse: " + Collections.min(marks));
    }

    public void min() {
        System.out.println("Note la plus haute: " + Collections.max(marks));
    }

    public void average() {
        double somme = 0;
        for (int note : marks) {
            somme += note;
        }
        somme = somme / marks.size();
        System.out.println("Moyenne: " + somme);
    }
}
