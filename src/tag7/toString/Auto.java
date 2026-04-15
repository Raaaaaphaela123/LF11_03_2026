package tag7.toString;

public class Auto extends Fahrzeug {

    private int anzahlTueren;

    // Annotation, die zeigt, dass eine Methode hier überschrieben wurde
    @Override
    public void bewegen() {
        IO.println("Das Auto bewegt sich.");
    }


    //Überladen von Methoden
    public void reifenWechseln() {
        IO.println("Reifen wurden gewechselt.");
    }

    public void reifenWechseln(String reifenArt) {
        IO.println(reifenArt + " wurden gewechselt.");
    }

    // Überschreiben der toString
    @Override
    public String toString() {
        return super.toString() + ", Anzahl der Türen: " + anzahlTueren;
    }

    // Getter & Setter
    public int getAnzahlTueren() {
        return anzahlTueren;
    }

    public void setAnzahlTueren(int anzahlTueren) {
        this.anzahlTueren = anzahlTueren;
    }
}
