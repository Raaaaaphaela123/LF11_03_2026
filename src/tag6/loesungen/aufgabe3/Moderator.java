package tag6.loesungen.aufgabe3;

public class Moderator extends User {
    // zusätzliches Attribut
    boolean istSuperModerator;

    // Konstruktor, der alle Attribute (auch die geerbten) entgegennimmt und per super() an den Elternkonstruktor gibt
    public Moderator(String username, int beitragsAnzahl, boolean istSuperModerator) {
        super(username, beitragsAnzahl);
        this.istSuperModerator = istSuperModerator;
    }
}
