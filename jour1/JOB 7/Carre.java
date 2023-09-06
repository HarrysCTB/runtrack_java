public class Carre {
    private int cote;

    public Carre(int cote) {
        this.cote = cote;
    }

    public void AireCarre() {
        double aire = cote * cote;
        String aireFormatee = String.format("%.1f", aire);
        String aireStr = aireFormatee.replace(",", ".");
        System.out.println("Aire du carré de côté " + cote + ": " + aireStr);
    }
}
