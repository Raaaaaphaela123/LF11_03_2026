package tag6._03_Vererbung;

public class App {
    static void main() {

        // Husky erstellen, der von Hund erbt
        Husky meinHusky = new Husky("Bello", 7, true);

        IO.println(meinHusky.info());

        // Pudel erstellen
        Pudel meinPudel = new Pudel("Fiffi", 2, true);
        IO.println(meinPudel.info());


        // Konkretes Objekt von der generischen Klasse Hund mit dem default Konstruktor
//        Hund lisa = new Hund();
//
//        // Namen & Alter ändern
//        lisa.name = "Lisa";
//        lisa.alter = 5;
//
//        lisa.ausgeben();
//        lisa.bellen();
//

    }
}
