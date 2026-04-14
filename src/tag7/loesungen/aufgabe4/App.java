package tag7.loesungen.aufgabe4;

public class App {
    static void main() {
        User user1 = new User("max_power", 5);
        Moderator moderator = new Moderator("the_mod_123", 150, true);
        Gast gast = new Gast("super_gast321", 10);

        // 1. Namen des Moderators
        IO.println(moderator.getUsername());

        // 2. Beim User ungültigen Wert eingeben und 3. prüfen
        user1.setBeitragsAnzahl(-5);
        user1.ausgeben();

        // 4. Namen ändern
        user1.setUsername("max_hero_99");
        user1.ausgeben();
    }
}
