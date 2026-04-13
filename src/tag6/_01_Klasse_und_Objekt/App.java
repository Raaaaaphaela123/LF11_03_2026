package tag6._01_Klasse_und_Objekt;

public class App {
    static void main() {

        // Konkretes Objekt von der Klasse Hund
        Hund lisa = new Hund();

        IO.println("Mein Hund heißt: " + lisa.name);
        IO.println("Mein Hund ist so alt: " + lisa.alter);

        // Namen & Alter ändern
        lisa.name = "Lisa";
        lisa.alter = 5;

        IO.println("Mein Hund heißt: " + lisa.name);
        IO.println("Mein Hund ist so alt: " + lisa.alter);

        lisa.bellen();

        // statische Methode -> kommt später!
        Hund.statischeMethode();

    }
}
