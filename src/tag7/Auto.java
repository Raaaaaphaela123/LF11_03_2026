package tag7;

public class Auto extends Fahrzeug {

    // Annotation, die zeigt, dass eine Methode hier überschrieben wurde
    @Override
    public void bewegen() {
        IO.println("Das Auto bewegt sich.");
    }

    public void reifenWechseln() {
        IO.println("Reifen wurden gewechselt.");
    }

    public void reifenWechseln(String reifenArt) {
        IO.println(reifenArt + " wurden gewechselt.");
    }
}
