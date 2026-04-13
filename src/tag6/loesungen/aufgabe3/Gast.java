package tag6.loesungen.aufgabe3;

public class Gast extends User {
    int tageGueltig;

    public Gast(String username, int tageGueltig) {
        super(username, 0);
        this.tageGueltig = tageGueltig;
    }

    public void ausgeben() {
        super.ausgeben();
        IO.println("TEST'");
    }
}
