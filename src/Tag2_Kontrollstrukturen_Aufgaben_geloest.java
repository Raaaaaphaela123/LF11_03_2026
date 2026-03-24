import javax.swing.*;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Tag2_Kontrollstrukturen_Aufgaben_geloest {

    public static void main(String[] args) {

        // Aufgabe 1: if-Anweisung
        int age = 17;
        int userAge = Integer.parseInt(IO.readln("Wie alt bist du: "));

        if (userAge >= 18) {
            System.out.println("Volljährig");
        } else {
            System.out.println("Minderjährig");
        }
        IO.println("#" .repeat(20)+"\n");
        // Aufgabe 2: if-else-Anweisung

        int punktZahl = Integer.parseInt(IO.readln("Gib dein Punktzahl ein: "));

        if (punktZahl >= 50) {
            System.out.println("Bestanden");
        } else {
            System.out.println("Nicht bestanden");
        }
        IO.println("#" .repeat(20)+"\n");


        // Aufgabe 3: else-if-Kette

        int note = Integer.parseInt(IO.readln("Gib dein Note ein: "));


        if (note == 1) {
            System.out.println("Sehr gut");
        } else if (note == 2) {
            System.out.println("Gut");
        } else if (note == 3) {
            System.out.println("Befriedigend");
        } else if (note == 4) {
            System.out.println("Ausreichend");
        } else if (note == 5) {
            System.out.println("Mangelhaft");
        } else if (note == 6) {
            System.out.println("Ungenügend");
        } else {
            System.out.println("Ungültige Note");
        }
        IO.println("#" .repeat(20)+"\n");

        // Aufgabe 4: switch-Anweisung

        int tag = 2;

        String wochentag = switch (tag) {
            case 1 -> "Montag";
            case 2 -> "Dienstag";
            case 3 -> "Mittwoch";
            case 4 -> "Donnerstag";
            case 5 -> "Freitag";
            case 6 -> "Samstag";
            case 7 -> "Sonntag";
            default -> "Ungültiger Tag";
        };

        System.out.println(wochentag);
        IO.println("#" .repeat(20)+"\n");

        // Extra Aufgabe 1: Einfacher ternärer Operator

        int zahl = 10;
        String paritaet = (zahl % 2 == 0) ? "gerade" : "ungerade";

        System.out.println("Die Zahl ist " + paritaet);
        IO.println("#" .repeat(20)+"\n");

        // Extra Aufgabe 2: Verschachtelter ternärer Operator

        int temperatur = 21;

        String beschreibung = (temperatur < 0)
                ? "Eiskalt"
                : (temperatur <= 20) ? "Kühl" : "Warm";

        System.out.println("Es ist: " + beschreibung);
        IO.println("#" .repeat(20)+"\n");


        // Zahlendreieck aber wie ein baum mit for schleife

        int maxZahl = 9;

        for (int i = 1; i <= maxZahl; i++) {

            for (int s = 0; s < maxZahl - i; s++) {
                System.out.print(" ");
            }


            for (int j = 0; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }

            System.out.println();
        }
        IO.println("#" .repeat(20)+"\n");
        // Algorithmen aus Struktogrammen

        try (var scanner = new Scanner(System.in)) {

        int m = Integer.parseInt(IO.readln("Gib m ein: "));
        int n = Integer.parseInt(IO.readln("Gib n ein: "));

        int r = m % n;

        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }
        IO.println("Der größte gemeinsame Teiler ist: " + n);
        IO.println("#" .repeat(20)+"\n");


        // Kapitalverdopplung

        int jahr = 0;

        int sk = Integer.parseInt(IO.readln("Gib dein Startkapital ein: "));
        int zs = Integer.parseInt(IO.readln("Gib die Zinssatz ein: "));

        double kapital = sk;

        do {
            kapital = kapital * (1 + (double) zs / 100);
            jahr++;
        } while (kapital < 2 * sk);

        IO.println("Kapital: %.2f €".formatted(kapital));
        IO.println("Kapitalverdoppelung nach: " + jahr + " Jahren.");
        IO.println("#" .repeat(20)+"\n");



            // Aufgabe: Passwortabfrage mit Wiederholungsversuch

        String correctPassword = "geheim123";
        int maxTry = 3;

        for (int i = 0; i <= maxTry; i++) {
            String passwort = JOptionPane.showInputDialog("Passwort: > ");

            if (passwort.equals(correctPassword)) {
                IO.println("Zugriff gewährt");
                break;
            } else {
                int rest = maxTry - 1;

                if (rest > 0) {
                    IO.println("Falsches Passwort. Noch %d Versuche.".formatted(rest));
                } else {
                    IO.println("Zugriff verweigert");
                }
            }

        }
        IO.println("#" .repeat(20)+"\n");






        }
    }
}