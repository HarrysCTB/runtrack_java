
import java.text.DecimalFormat;

public class Cercle {
    private int rayon;

    public Cercle(int rayon) {
        this.rayon = rayon;
    }

    public void AireCercle() {
        double aire = Math.PI * Math.pow(rayon, 2);
        String aireFormatee = String.format("%.2f", aire);
        String aireStr = aireFormatee.replace(",", ".");
        System.out.println("Aire du cercle de rayon " + rayon + ": " + aireStr);
    }
}
