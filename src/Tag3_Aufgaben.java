import javax.swing.*;


void main() {

    //Aufgabe 1: Grundlagen & Zugriff

    int[] zahlen = {10, 20, 30, 40, 50};

    IO.println("Erstes Element: " + zahlen[0]);
    IO.println("Letztes Element: " + zahlen[zahlen.length - 1]);
    zahlen[1] = 25;

    IO.println("Das gesamte Array: ");
    for (int i = 0; i < zahlen.length; i++) {
        IO.println("Index " + i + ": " + zahlen[i]);
    }
    IO.println("#".repeat(20) + "\n");


    // Aufgabe 2: Mittelwerte und Berechnungen

    // User Input
    int[] numbers = new int[6];
    int index = 0;
    int summe = 0;


    while (index < numbers.length) {
        String input = JOptionPane.showInputDialog("Gib 6 Zahlen ein.\n " +
                "Eingabe: %d von 6:".formatted(index + 1));
        numbers[index] = Integer.parseInt(input);
        index++;
    }

    // sum of Array index
    for (int wert : numbers) {
        summe += wert;
    }

    // calculate Durchschnitt
    double durchschnitt = (double) summe / numbers.length;

    // Output
    JOptionPane.showMessageDialog(null, "--- Auswertung ---\n"
            + "Array inhalt: " + Arrays.toString(numbers) + "\n"
            + "Summe alle Werte: " + summe + "\n"
            + "Durchschnitt: %.2f".formatted(durchschnitt));
    IO.println("#".repeat(20) + "\n");



    // Aufgabe 3:

    var random = new Random();
    int[] numms = new int[10];

    for (int i = 0; i < numms.length; i++) {
        numms[i] = random.nextInt(100) + 1;
    }

    // 2. Create Minimum & Maximum
    int min = numms[0];
    int max = numms[0];
    int minIndex = 0;
    int maxIndex = 0;

    // 3. Iterate through Array and calculate
    for (int i = 1; i < numms.length; i++) {
        if (numms[i] < min) {
            min = numms[i];
            minIndex = i;
        }
        if (numms[i] > max) {
            max = numms[i];
            maxIndex = i;
        }
    }

    // output
    IO.println("Zufalls-Array: " + Arrays.toString(numms));
    IO.println("Minimum: %d an Index %d".formatted(min, minIndex));
    IO.println("Maximum: %d an Index %d".formatted(max, maxIndex));
    // Zusatz
    Arrays.sort(numms);
    IO.println("\nSortiertes Array: " + Arrays.toString(numms));
    if (min == numms[0] && max == numms[numms.length - 1]) {
        IO.println("Vergleich erfolgreich: Min/Max stimmen mit dem sortierten Array überein!");
    }
    IO.println("#".repeat(20) + "\n");


    // Aufgabenstellung: Temperaturen der Woche mit Bonus direct integriert

    String tageInput = JOptionPane.showInputDialog("Wie viele Tage sollen erfasst werden?");
    int anzahlTage = Integer.parseInt(tageInput);

    int[] temperaturen = new int[anzahlTage];
    StringBuilder alleTempsText = new StringBuilder("Temperaturen der Woche:\n");

    // 2. Read the temperature
    for (int i = 0; i < anzahlTage; i++) {
        String tempInput = JOptionPane.showInputDialog("Temperatur für Tag " + (i + 1) + ":");
        temperaturen[i] = Integer.parseInt(tempInput);

        // Text for the output
        alleTempsText.append("Tag ").append(i + 1).append(": ").append(temperaturen[i]).append("°C\n");
        summe += temperaturen[i];
    }

    // 3. Find Max & min
    int mini = temperaturen[0];
    int maxi = temperaturen[0];
    for (int temp : temperaturen) {
        if (temp < mini) mini = temp;
        if (temp > maxi) maxi = temp;
    }

    // 4. Calculate the avg
    double durch_schnitt = (double) summe / anzahlTage;

    // 5. output
    String ergebnis = alleTempsText + "\nErgebnisse:\n" +
            "Durchschnitt: %.2f°C\n".formatted(durch_schnitt) +
            "Höchste Temperatur: %d°C\n".formatted(maxi) +
            "Niedrigste Temperatur: %d°C".formatted(mini);

    JOptionPane.showMessageDialog(null, ergebnis);

// Aufgabe: Der Kino-Sitzplan

    int[][] kino = new int[3][4];

    kino[0][1] = 1;
    kino[1][3] = 1;
    kino[2][0] = 1;

    IO.println(Arrays.deepToString(kino));

    int reihe = 0;
    for (int i = 0; i < 1; i++) {
        for (int[] ints : kino) {
            for (int wert : ints) {
                IO.print(wert + " ");
            }
            IO.println();
        }
        int reihenAnzahl = kino.length;
        int sitzeProReihe = kino[0].length;
        int gesamtSitze = reihenAnzahl * sitzeProReihe;

        IO.println("--- Kino Statistik ---");
        IO.println("Anzahl Reihen: " + reihenAnzahl);
        IO.println("Sitze pro Reihe: " + sitzeProReihe);
        IO.println("Sitze insgesamt: " + gesamtSitze);
    }

}