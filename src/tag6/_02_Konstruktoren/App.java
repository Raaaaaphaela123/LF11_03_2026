package tag6._02_Konstruktoren;

public class App {
    static void main() {

        // Konkretes Objekt von der Klasse Hund mit dem default Konstruktor
        Hund lisa = new Hund();

        // Namen & Alter ändern
        lisa.name = "Lisa";
        lisa.alter = 5;

        lisa.ausgeben();
        lisa.bellen();

        // Konkretes Objekt über den selbst definierten Konstruktor  mit 2 Argumenten
        Hund bello = new Hund("Bello", 1);
        bello.ausgeben();

        // Konkretes Objekt über den selbst definierten Konstruktor  mit 2 Argumenten
        Hund unbekannt = new Hund( 1);
        unbekannt.ausgeben();

    }
}
