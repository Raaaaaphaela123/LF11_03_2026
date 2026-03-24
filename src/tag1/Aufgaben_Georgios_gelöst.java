package tag1;

public class Aufgabensammlung {

    public static void main(String[] args) {

//        // ---------------------------------------------------------
//        // Aufgabe 1: Einfacher Taschenrechner
//        // Schreibe ein Programm, das:
//        // - zwei ganze Zahlen vom Benutzer einliest
//        // - Addition, Subtraktion, Multiplikation und Division berechnet
//        // - die Ergebnisse ausgibt
//        // ---------------------------------------------------------
        double zahl1 = Double.parseDouble(IO.readln("Gib ein zahl ein: "));
        double zahl2 = Double.parseDouble(IO.readln("Gib ein zahl ein: "));

        double Addition = zahl1 + zahl2;
        double Subtraktion = zahl1 - zahl2;
        double Multiplikation = zahl1 * zahl2;
        double Division = zahl1 / zahl2;

         IO.println("--- Ergebnisse ---");
         IO.println("Addition:  " + Addition);
         IO.println("Subtraktion:  " + Subtraktion);
         IO.println("Multiplikation:  " + Multiplikation);
         IO.println("Division: " + Division);



//        // ---------------------------------------------------------
//        // Aufgabe 2: Temperaturrechner
//        // Lies eine Temperatur in Celsius ein und wandle sie
//        // in Fahrenheit um.
//        // Formel: F = C * 1.8 + 32
//        // ---------------------------------------------------------


        double TempCel = Double.parseDouble(IO.readln("Gib temperatur in Celsius ein: "));
        double erg = TempCel * 1.8 +32;
        IO.println("Die Temperatur in Fahrenheit ist: " + erg);


        // ---------------------------------------------------------
        // Aufgabe 3: BMI-Rechner
        // Lies ein:
        // - Gewicht (kg)
        // - Größe (m)
        // Berechne den BMI:
        // BMI = Gewicht / (Größe²)
        // ---------------------------------------------------------

        double gewicht = Double.parseDouble(IO.readln("Gib dein Gewicht in kg ein: "));
        double gross = Double.parseDouble(IO.readln("Gib dein Größe in m ein: "));
        double bmi = gewicht / (gross * gross);

        System.out.printf("Dein BMI beträgt: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Kategorie: Untergewicht");
        } else if (bmi < 25) {
            System.out.println("Kategorie: Normalgewicht");
        } else {
            System.out.println("Kategorie: Übergewicht");
        }


        // ---------------------------------------------------------
        // Aufgabe 4: Minuten in Stunden und Minuten umrechnen
        // Der Benutzer gibt eine Anzahl Minuten ein.
        // Rechne sie um in:
        // - volle Stunden
        // - verbleibende Minuten
        // Beispiel: 135 → 2 Stunden und 15 Minuten
        // ---------------------------------------------------------

        int gesamtMin = Integer.parseInt(IO.readln("Gib eine Anzahl in minuten ein: "));
        int volStunde = gesamtMin / 60;
        int restMin = gesamtMin % 60;
        IO.println(gesamtMin + " Minuten sind: "
                + volStunde + " Stunde(n): "
                 + restMin + " Minuten");



        // ---------------------------------------------------------
        // Aufgabe 5: String + Zahl
        // Lies einen Namen und ein Alter ein.
        // Gib aus:
        // "Hallo <Name>, in 10 Jahren bist du <Alter+10>!"
        // ---------------------------------------------------------

        String userName  = IO.readln("Gib deinen Namen ein: ");
        int alter = Integer.parseInt(IO.readln("Gib dein Alter ein: "));
        int alterInZehnJahren = alter + 10;
        IO.println("Hallo " + userName + ", in 10 Jahren bist du: " + alterInZehnJahren);


        // ---------------------------------------------------------
        // Aufgabe 6: Modulo-Rechner
        // Lies eine ganze Zahl ein und gib aus:
        // - ob sie gerade oder ungerade ist
        // - ob sie durch 3 teilbar ist
        // - ob sie durch 5 teilbar ist
        // Nutze dazu den Modulo-Operator (%).
        // ---------------------------------------------------------
        double zahl = Double.parseDouble(IO.readln("Gib ein zahl ein: "));
        if (zahl % 2 == 0) {
            IO.println("Die Zahl: " + zahl + " ist gerade.");
        }  else {
            IO.println("Die Zahl " + zahl + " ist ungerade.");

        if  (zahl % 3 == 0) {
            IO.println("Die zahl ist durch 3 teilbar");
        } else {
            IO.println("Die zahl ist nicht durch 3 teilbar");
        }

        if  (zahl % 5 == 0) {
            IO.println("Die zahl ist durch 5 teilbar");
        } else {
            IO.println("Die zahl ist nicht durch 5 teilbar");
        }


        // ---------------------------------------------------------
        // Aufgabe 7: Durchschnittsrechner
        // Benutzer gibt drei double-Werte ein.
        // Berechne den Durchschnitt.
        // Runde das Ergebnis auf zwei Nachkommastellen.
        // ---------------------------------------------------------
        double z1 = Double.parseDouble(IO.readln("Gib ein zahl ein: "));
        double z2 = Double.parseDouble(IO.readln("Gib noch ein zahl ein: "));
        double z3 = Double.parseDouble(IO.readln("Gib noch ein zahl ein: "));

        double durchschnitt = (z1 + z2 + z3) / 3.0;

        System.out.printf("Der Durchschnitt der drei Zahlen ist: %.2f\n", durchschnitt);

        // ---------------------------------------------------------
        // Aufgabe 8: Preisberechnung mit Mehrwertsteuer
        // Lies ein:
        // - Nettopreis (double)
        // - Mehrwertsteuer in % (double)
        // Berechne den Bruttopreis:
        // Brutto = Netto * (1 + MwSt/100)
        // ---------------------------------------------------------
        double netto= Double.parseDouble(IO.readln("Gib den Nettopreis in Euro ein: "));
        double mehrwertsteuersatz = Double.parseDouble(IO.readln("Gib den Mehrwertsteuersatz in % ein (z.B. 19): "));
        double brutto = netto * (1 + (mehrwertsteuersatz / 100.0));
        double steuerbetrag = brutto - netto;

        System.out.printf("Netto: %.2f €\n", netto);
        System.out.printf("MwSt (%.1f%%): %.2f €\n", mehrwertsteuersatz, steuerbetrag);
        System.out.println("-------------------------");
        System.out.printf("Brutto-Endpreis: %.2f €\n", brutto);




        // ---------------------------------------------------------
        // Aufgabe 9: Sekundenrechner
        // Benutzer gibt eine Anzahl Sekunden ein.
        // Rechne sie um in:
        // - Stunden
        // - Minuten
        // - Sekunden
        // Beispiel: 3665 → 1 h, 1 min, 5 sec
        // ---------------------------------------------------------
        long gesamtSec = Integer.parseInt(IO.readln("Gib eine Anzahl in Sekunden ein: "));
        long stunden = gesamtSec / 3600;
        long restNachStunden = gesamtSec % 3600;
        long minuten = restNachStunden / 60;
        long sekunden = restNachStunden % 60;
        IO.println(gesamtSec + " Sekunden, "
                + stunden + " stunden, "
                + minuten + " minuten, "
                + sekunden + " Sekunden!");
    }
}