package tag4.loesungen;

import java.util.ArrayList;

public class Gaesteliste {
    static void main() {
        // 1. Erstellung der ArrayList
        ArrayList<String> gaesteliste = new ArrayList<>();

        // 2. Namen hinzufügen
        gaesteliste.add("Anna");
        gaesteliste.add("Ben");
        gaesteliste.add("Clara");
        gaesteliste.add("Daniel");

        // 3. Bearbeiten
        gaesteliste.remove("Daniel"); // Entfernen nach Objekt-Name oder Index
        gaesteliste.set(1, "Ben & Begleitung"); // Ersetzt "Ben" an Index 1

        // 4. Informationen prüfen
        if (gaesteliste.contains("Anna")) {
            IO.println("Anna ist eingeladen.");
        }
        IO.println("Anzahl der Gäste: " + gaesteliste.size());

        // 5. Gesamte Liste ausgeben
        IO.println("Aktuelle Gästeliste:");
        for (String gast : gaesteliste) {
            IO.println("- " + gast);
        }
    }
}

