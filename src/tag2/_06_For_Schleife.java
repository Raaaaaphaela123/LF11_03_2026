package tag2;

public class _06_For_Schleife {

    static void main() {

        // Was ist eine for-Schleife?
        // Sie wiederholt Anweisungen, solange eine Bedingung erfüllt ist.
        // Klassische for-Schleife: Startwert; Bedingung; Schrittweite

        for (int i = 0; i < 10; i++) {
            IO.println(i);
        }

        // Verschachtelte For-Schleifen
        // Äußere for-Schleife:
        // Diese Schleife bestimmt die Zeilen (z. B. 1 bis 3)
        for (int i = 1; i <= 3; i++) {

            // Innere for-Schleife:
            // Diese Schleife läuft für jede Zeile erneut (z. B. 1 bis 4)
            for (int j = 1; j <= 4; j++) {

                // Ausgabe von i und j in einer Zeile
                System.out.print("i=" + i + ", j=" + j + "  ");
            }

            // Zeilenumbruch nach jeder vollständigen inneren Schleife
            System.out.println();
        }

        // Enhanced For Loop
        String[] warenkorb = {"Laptop", "Buch", "Banane"};
        for (String artikel : warenkorb) {
            IO.println(artikel);
        }

        // Vorteil: Kein Index nötig, kürzerer und übersichtlicherer Code
    }
}
