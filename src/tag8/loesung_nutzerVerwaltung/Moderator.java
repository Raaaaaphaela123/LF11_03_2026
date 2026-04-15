package tag8.loesung_nutzerVerwaltung;

public class Moderator extends User{
    private boolean istSuperModerator;

    public Moderator(String username, int beitragsAnzahl, boolean istSuperModerator) {
        super(username, beitragsAnzahl);
        this.istSuperModerator = istSuperModerator;
    }

    @Override
    public String toString() {
        return "[Moderator: " + getUsername() + " | Beiträge: " + getBeitragsAnzahl() + " | Supermod: " + (istSuperModerator ? "ja" : "nein") + "]";
    }
}
