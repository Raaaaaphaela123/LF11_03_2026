package tag2;

public class _06_For_Schleife {

    static void main() {

        // Was ist eine for-Schleife?
        // Sie wiederholt Anweisungen, solange eine Bedingung erfüllt ist.
        // Klassische for-Schleife: Startwert; Bedingung; Schrittweite

        for(int i = 0; i < 10; i++) {
            IO.println(i);
        }

        // verschachtelten For-Schleifen
        // äußere Schleife
//        for (int i = 1; i <= 10; i++) {
//            IO.println("Start der äußeren Schleife");
//            for (int j = 1; j <= 5; j++) {
//                IO.print(j);
//            }
//            IO.println();
//            IO.println("Äußere nach Innerer");
//        }

        // Enhanced For Loop
        String[] warenkorb = {"Laptop", "Buch", "Banane"};
        for (String artikel : warenkorb) {
            IO.println(artikel);
        }

        // Vorteil: Kein Index nötig, kürzerer und übersichtlicherer Code
    }
}
