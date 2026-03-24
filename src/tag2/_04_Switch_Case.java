package tag2;

public class _04_Switch_Case {
    static void main() {

        int monat = Integer.parseInt(IO.readln("Bitte Monat eingeben (1-12)"));
        String versandSaison = "";

        switch (monat) {
            case 12, 1, 2:
                versandSaison = "Winterversand";
                break; // wichtig, sonst fall-through
            case 3, 4, 5:
                versandSaison = "Frühlingversand";
                break;
            case 6, 7, 8:
                versandSaison = "Sommerversand";
                break;
            case 9, 10, 11:
                versandSaison = "Herbstversand";
                break;
            default:
                versandSaison = "Ungültiger Monat";
        }

        IO.println(versandSaison);

        // Klassischer Switch
        String tag = "Monday";

        int tagNummer;
        switch (tag) {
            case "Monday":
                tagNummer = 1;
                break;
            case "Tuesday":
                tagNummer = 2;
                break;
            case "Wednesday":
                tagNummer = 3;
                break;
            default:
                tagNummer = 0;
        }
        IO.println("Tagnummer klassischer Switch: " + tagNummer);

        // Enhanced Switch
        int newTagNummer = switch (tag) {
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            default -> 0;
        };

        IO.println("Tagnummer enhanced switch: " + newTagNummer);

        /*
         * Erklärung:
         * - Klassischer Switch: Man braucht 'break', sonst Fall-Through.
         * - Enhanced Switch: Kein break nötig, jeder Fall ist ein eigener Ausdruck.
         * - Vorteil: kürzer, übersichtlicher, verhindert unbeabsichtigtes Durchlaufen weiterer Fälle.
         */
    }


}
