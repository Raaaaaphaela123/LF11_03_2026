package tag6._03_Vererbung;

public class Hund {
    // Attribute (Eigenschaften)
    String name;
    int alter;

    // default -> passiert automatisch im Hintergrund, wenn
    // kein eigener Konstruktor definiert ist
    // verschwindet, sobald wir einen eigenen Konstruktor schreiben
    public Hund () {
    }

    // Konstruktor, der das Alter fordert
    public Hund(int alter) {
        this.alter = alter;
        this.name = "Unbekannter Name";
    }

    // Konstruktor, der Name und Alter fordert
    public Hund(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    // Methoden - was ein Objekt vom Typ Hund an Funktionalität haben muss
    public void bellen(){
        IO.println(name + " macht Wuff!");
    }

    // Ausgabemethode
    public String info() {
        return this.name + " ist so alt: " + this.alter;
    }

}
