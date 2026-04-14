package tag7.loesungen.aufgabe4;

public class User {
    // 1. auf private setzen statt default package protected
    // 3. man kann sie auch auf protected setzen, dann können erbende Klassen weiterhin ohne Getter drauf zugreifen
    private String username;
    private int beitragsAnzahl;

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
        IO.println("Benutzer: " + username + " (Beiträge: " + beitragsAnzahl + ")");
    }

    // 2. Getter & Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBeitragsAnzahl() {
        return beitragsAnzahl;
    }

    // Validierung
    public void setBeitragsAnzahl(int beitragsAnzahl) {
        if (beitragsAnzahl < 0) {
            IO.println("Beiträge können nicht weniger als 0 sein. Der Wert wird nicht verändert.");
        } else {
            this.beitragsAnzahl = beitragsAnzahl;
        }
    }
}
