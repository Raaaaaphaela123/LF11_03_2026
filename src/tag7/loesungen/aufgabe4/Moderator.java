package tag7.loesungen.aufgabe4;

public class Moderator extends User {
    // zusätzliches Attribut
    private boolean istSuperModerator;

    // Konstruktor, der alle Attribute (auch die geerbten) entgegennimmt und per super() an den Elternkonstruktor gibt
    public Moderator(String username, int beitragsAnzahl, boolean istSuperModerator) {
        super(username, beitragsAnzahl);
        this.istSuperModerator = istSuperModerator;
    }
}
