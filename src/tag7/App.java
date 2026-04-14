package tag7;

import java.util.ArrayList;

public class App {
    static void main() {
        Fahrzeug fahrzeug = new Fahrzeug();
        fahrzeug.bewegen();

        Fahrzeug auto = new Auto();
        auto.bewegen();

        Fahrzeug schiff = new Schiff();
        schiff.bewegen();

        // Super nützlich, wenn man z.B. mit Listen arbeitet
        ArrayList<Fahrzeug> fahrzeuge = new ArrayList<>();
        fahrzeuge.add(fahrzeug);
        fahrzeuge.add(auto);
        fahrzeuge.add(schiff);

        IO.println("Ausgabe in einer Schleife:");
        for (Fahrzeug fz : fahrzeuge) {
            fz.bewegen(); // dynamische Bindung - zur Laufzeit wird entschieden, welche Implementierung herangezogen wird
        }

        // Demo von Überladen
        Auto auto1 = new Auto();
        auto1.reifenWechseln();
        auto1.reifenWechseln("Sommerreifen");

    }
}
