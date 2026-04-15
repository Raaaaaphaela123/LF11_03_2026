package tag8.loesung_nutzerVerwaltung;

public class User {
    private static int userZaehler = 0;

    private String username;
    private int beitragsAnzahl;

    public User(String username, int beitragsAnzahl) {
        this.username = username;
        this.beitragsAnzahl = beitragsAnzahl;

        userZaehler++;
    }

    // Konstruktor B
    public User() {
        this.username = "Unbekannt";
        this.beitragsAnzahl = 0;

        userZaehler++;
    }

    public static int getUserZaehler() {
        return userZaehler;
    }

    @Override
    public String toString() {
        return "[User: " + username + " | Beiträge: " + beitragsAnzahl + "]";
    }

    // Getter & Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBeitragsAnzahl() {
        return beitragsAnzahl;
    }

    public void setBeitragsAnzahl(int beitragsAnzahl) {
        if (beitragsAnzahl < 0) {
            IO.println("Beiträge können nicht weniger als 0 sein. Der Wert wird nicht verändert.");
        } else {
            this.beitragsAnzahl = beitragsAnzahl;
        }
    }
}
