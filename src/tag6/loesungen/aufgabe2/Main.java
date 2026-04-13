package tag6.loesungen.aufgabe2;

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
    }
}
