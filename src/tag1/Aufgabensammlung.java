package tag1;

public class Aufgabensammlung {

    static void print20lines() {
        for (int i = 0; i < 20; i++) {
            IO.println("\n");
        }
    }

    public static void main(String[] args) {

        while (true) {

            IO.println("Gib die nummer der aufgabe ein welche du testen möchtest");
            IO.println(1 + " Taschenrechner");
            IO.println(2 + " Temperaturrechner");
            IO.println(3 + " BMI-Rechner");
            IO.println(4 + " Minuten in Stunden und Minuten umrechnen");
            IO.println(5 + " String + Zahl");
            IO.println(6 + " Modulo-Rechner");
            IO.println(7 + " Durchschnittsrechner");
            IO.println(8 + " Preisberechnung mit Mehrwertsteuer");
            IO.println(9 + " Sekundenrechner");

            int which = Integer.parseInt(IO.readln(0 + " Zum Beenden\n: "));
            print20lines();


            // ---------------------------------------------------------
            // Aufgabe 1: Einfacher Taschenrechner
            // Schreibe ein Programm, das:
            // - zwei ganze Zahlen vom Benutzer einliest
            // - Addition, Subtraktion, Multiplikation und Division berechnet
            // - die Ergebnisse ausgibt
            // ---------------------------------------------------------
            if (which == 1) {
                IO.println("Taschenrechner\n");
                int zahl1 = Integer.parseInt(IO.readln("Gebe die 1 zahl in mit der du rechnen möchtest"));
                int zahl2 = Integer.parseInt(IO.readln("Gebe die 2 zahl in mit der du rechnen möchtest"));
                IO.println(zahl1 + " + " + zahl2 + " = " + (zahl1 + zahl2));
                IO.println(zahl1 + " - " + zahl2 + " = " + (zahl1 - zahl2));
                IO.println(zahl1 + " * " + zahl2 + " = " + (zahl1 * zahl2));
                IO.println(zahl1 + " / " + zahl2 + " = " + ((double) zahl1 / (double) zahl2));
                IO.readln("Drücke Enter zum fortfahren");
                print20lines();
            }


            // ---------------------------------------------------------
            // Aufgabe 2: Temperaturrechner
            // Lies eine Temperatur in Celsius ein und wandle sie
            // in Fahrenheit um.
            // Formel: F = C * 1.8 + 32
            // ---------------------------------------------------------
            else if (which == 2) {
                IO.println("Temperaturrechner\n");
                double celsius = Double.parseDouble(IO.readln("Temperaturrechner \nGib eine Temperatur in Celsius ein: "));
                double fahrenheit = (celsius * 1.8) + 32;
                IO.println(celsius + " Celsius sind" + fahrenheit + " Fahrenheit");
                IO.readln("Drücke Enter zum fortfahren");
                print20lines();
            }


            // ---------------------------------------------------------
            // Aufgabe 3: BMI-Rechner
            // Lies ein:
            // - Gewicht (kg)
            // - Größe (m)
            // Berechne den BMI:
            // BMI = Gewicht / (Größe²)
            // ---------------------------------------------------------
            else if (which == 3) {
                IO.println("BMI-Rechner\n");
                double gewicht = Double.parseDouble(IO.readln("Gib dein Gewicht in Kg an \n: "));
                double groesse = Double.parseDouble(IO.readln("Gib deine Größe in Meter an \n: "));
                IO.println("Dein BMI: " + (gewicht/(groesse*2)));


                IO.readln("Drücke Enter zum fortfahren");
                print20lines();
            }


            // ---------------------------------------------------------
            // Aufgabe 4: Minuten in Stunden und Minuten umrechnen
            // Der Benutzer gibt eine Anzahl Minuten ein.
            // Rechne sie um in:
            // - volle Stunden
            // - verbleibende Minuten
            // Beispiel: 135 → 2 Stunden und 15 Minuten
            // ---------------------------------------------------------
            else if (which == 4) {
                IO.println("Minuten in Stunden und Minuten umrechnen\n");
                int minuten = Integer.parseInt(IO.readln("Gib die Anzahl an Minuten ein die du umrechnen möchtest\n: "));
                int stunden = minuten / 60;
                int rest_minuten = minuten - (stunden * 60);
                IO.println(minuten + " → " + stunden + " Stunden und " + rest_minuten + " Minuten");


                IO.readln("Drücke Enter zum fortfahren");
                print20lines();
            }


            // ---------------------------------------------------------
            // Aufgabe 5: String + Zahl
            // Lies einen Namen und ein Alter ein.
            // Gib aus:
            // "Hallo <Name>, in 10 Jahren bist du <Alter+10>!"
            // ---------------------------------------------------------
            else if (which == 5) {
                IO.println("String + Zahl\n");
                String name = IO.readln("Wie lautet dein Name? \n: ");
                int alter = Integer.parseInt(IO.readln("Wie alt bist du? \n: "));
                IO.println("Hallo " + name + " in 10 Jahren bist du " + (alter + 10));


                IO.readln("Drücke Enter zum fortfahren");
                print20lines();
            }


            // ---------------------------------------------------------
            // Aufgabe 6: Modulo-Rechner
            // Lies eine ganze Zahl ein und gib aus:
            // - ob sie gerade oder ungerade ist
            // - ob sie durch 3 teilbar ist
            // - ob sie durch 5 teilbar ist
            // Nutze dazu den Modulo-Operator (%).
            // ---------------------------------------------------------
            else if (which == 6) {
                IO.println("Modulo-Rechner\n");
                int number = Integer.parseInt(IO.readln("Gib eine Zahl ein \n: "));
                boolean modulo2 = number % 2 == 0;
                boolean modulo3 = number % 3 == 0;
                boolean modulo5 = number % 5 == 0;

                IO.print("Deine zahl ist ");
                if (modulo2){
                    IO.print("Gerade, ");
                } else {
                    IO.print("Ungerade, ");
                }
                if (modulo3){
                    IO.print("teilbar durch 3 ");

                } else {
                    IO.print("nicht teilbar durch 3 ");
                }
                if (modulo5) {
                    IO.print("und teilbar durch 5.\n");
                } else {
                    IO.print("und nicht teilbar durch 5.\n");
                }


                IO.readln("Drücke Enter zum fortfahren");
                print20lines();
            }


            // ---------------------------------------------------------
            // Aufgabe 7: Durchschnittsrechner
            // Benutzer gibt drei double-Werte ein.
            // Berechne den Durchschnitt.
            // Runde das Ergebnis auf zwei Nachkommastellen.
            // ---------------------------------------------------------
            else if (which == 7) {
                IO.println("Durchschnittsrechner\n");
                double zahl1 = Double.parseDouble(IO.readln("gib die erste zahl ein\n: "));
                double zahl2 = Double.parseDouble(IO.readln("gib die zweite zahl ein\n: "));
                double zahl3 = Double.parseDouble(IO.readln("gib die dritte zahl ein\n: "));
                IO.println("der durchschnitt deiner 3 zahlen ist " + ((zahl1 + zahl2 + zahl3)/3));


                IO.readln("Drücke Enter zum fortfahren");
                print20lines();
            }


            // ---------------------------------------------------------
            // Aufgabe 8: Preisberechnung mit Mehrwertsteuer
            // Lies ein:
            // - Nettopreis (double)
            // - Mehrwertsteuer in % (double)
            // Berechne den Bruttopreis:
            // Brutto = Netto * (1 + MwSt/100)
            // ---------------------------------------------------------
            else if (which == 8) {
                IO.println("Preisberechnung mit Mehrwertsteuer\n");
                double netto = Double.parseDouble(IO.readln("Was ist der Nettopreis in €?\n: "));
                double mwst = Double.parseDouble(IO.readln("Wie hoch ist die Mehwertsteuer in % ?\n: "));
                IO.println("Der Preis inklusive Mehrwertsteuer beträgt: " + (netto + (netto * mwst/100)) + " €.");


                IO.readln("Drücke Enter zum fortfahren");
                print20lines();
            }


            // ---------------------------------------------------------
            // Aufgabe 9: Sekundenrechner
            // Benutzer gibt eine Anzahl Sekunden ein.
            // Rechne sie um in:
            // - Stunden
            // - Minuten
            // - Sekunden
            // Beispiel: 3665 → 1 h, 1 min, 5 sec
            // ---------------------------------------------------------
            else if (which == 9) {
                IO.println("Sekundenrechner\n");
                int sek = Integer.parseInt(IO.readln("Wie viele Sekunden möchtest du umrechnen?\n: "));
                int std = sek / 3600;
                int min = (sek - (std*3600))/60;
                int rest_sek = sek - ((std*3600)+ (min *60));
                IO.println(sek + " Sekunden entsprechen " + std + " Stunden " + min + " Minuten und " + rest_sek + " Sekunden.");


                IO.readln("Drücke Enter zum fortfahren");
                print20lines();
            }


            else if (which == 0) {
                break;
            }

            else {
                print20lines();
                IO.println("Eingabe nicht erkannt");
                IO.readln("Drücke Enter zum fortfahren");
                print20lines();
            }
        }
    }
}
