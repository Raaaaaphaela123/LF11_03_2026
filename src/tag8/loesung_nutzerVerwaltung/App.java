package tag8.loesung_nutzerVerwaltung;

import java.util.ArrayList;

public class App {
    static void main() {

        // 1. Liste initialisieren
        ArrayList<User> userVerwaltung = new ArrayList<>();

        // 2. Objekte erstellen und der Liste hinzufügen
        User user1 = new User("max_power", 5);
        User user2 = new User("elise_coding", 9);
        Moderator moderator = new Moderator("the_mod_123", 150, true);
        Gast gast1 = new Gast("super_gast321", 10);
        Gast gast2 = new Gast("shiny_guest", 10);

        userVerwaltung.add(user1);
        userVerwaltung.add(user2);
        userVerwaltung.add(moderator);
        userVerwaltung.add(gast1);
        userVerwaltung.add(gast2);

        // 3. Gesamte Liste ausgeben
        for (User user : userVerwaltung) {
            IO.println(user);
        }

        // 4. Gezielte Suche
        String suche = "the_mod_123";
        for (User user : userVerwaltung) {
            if (user.getUsername().equals(suche)) {
                IO.println("User mit dem Namen '" + suche + "' gefunden.");
                break;
            }
        }

        // 5. Beiträge zählen
        ermittleGesamtBeitraege(userVerwaltung);

        // 6. Gäste entfernen
        // Option 1
        for (int i = userVerwaltung.size() - 1; i >= 0; i--) {
            if (userVerwaltung.get(i) instanceof Gast) {
                userVerwaltung.remove(i); // Nutze den Index zum Löschen
            }
        }

        // Option 2
        userVerwaltung.removeIf(user -> user instanceof Gast);

        // Ausgabe
        IO.println(userVerwaltung);

        // 7. Finaler Check
        IO.println("Gesamt erstellte Nutzer: " + User.getUserZaehler());
    }

    public static void ermittleGesamtBeitraege(ArrayList<User> userVerwaltung) {
        int gesamtBeitraege = 0;
        for (User user : userVerwaltung) {
            gesamtBeitraege += user.getBeitragsAnzahl();
        }
        IO.println("Gesamtbeiträge: " + gesamtBeitraege);
    }
}
