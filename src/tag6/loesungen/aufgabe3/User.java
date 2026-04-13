package tag6.loesungen.aufgabe3;

public class User {
    String username;
    int beitragsAnzahl;

    // Konstruktor A
    public User(String username, int beitragsAnzahl) {
        this.username = username;
        this.beitragsAnzahl = beitragsAnzahl;
    }

    // Konstruktor B
    public User() {
        this.username = "Unbekannt";
        this.beitragsAnzahl = 0;
    }

    public void ausgeben() {
        IO.print("\nBenutzer: " + username + " (Beiträge: " + beitragsAnzahl + ")");
    }
}