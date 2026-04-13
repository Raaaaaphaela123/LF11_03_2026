package tag6.loesungen.aufgabe3;

public class Main {
    static void main() {
        // Erstes Objekt erstellen (Konstruktor A)
        User user1 = new User("max_power", 5);

        // Methode aufrufen
        user1.ausgeben();

        // Zweites Objekt erstellen (Konstruktor B)
        User user2 = new User();

        // Methode aufrufen
        user2.ausgeben();

        // 1. Admin-Objekt
        Moderator moderator = new Moderator("the_mod_123", 150, true);

        // 2. Gast-Objekt
        Gast gast = new Gast("super_gast321", 10);

        // 3. ausgeben der Werte -> Methode wird aus der Elternklasse geerbt
        moderator.ausgeben();
        gast.ausgeben();
    }
}
