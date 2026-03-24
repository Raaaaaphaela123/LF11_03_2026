package tag2;

public class _03_IF_Anweisungen {
    static void main() {

        double temperatur = 33;

        // Einfache Bedingung
        if (temperatur > 30) {
            IO.println("Ganz schön heiß.");
        }

        // If-Else
        if (temperatur > 30) {
            IO.println("Ganz schön heiß.");
        } else {
            IO.println("Kann man schon noch irgendwie aushalten.");
        }

        // If-Else mit mehreren Bedingungen
        if (temperatur > 30) {
            IO.println("Ganz schön heiß.");
        } else if (temperatur > 20) {
            IO.println("T-Shirt Wetter");
        } else {
            IO.println("Zieh dir einen Hoodie an.");
        }

        // If-Else mit logischen Operatoren

        boolean istAngemeldet = false;
        boolean hatGuthaben = false;

        if (istAngemeldet && hatGuthaben) {
            IO.println("Viel Spaß beim Shoppen!");
        } else if (istAngemeldet) {
            IO.println("Du brauchst Guthaben...");
        } else if (hatGuthaben) {
            IO.println("Melde dich bitte an.");
        } else {
            IO.println("Bist du überhaupt Kunde hier?");
        }
    }
}
