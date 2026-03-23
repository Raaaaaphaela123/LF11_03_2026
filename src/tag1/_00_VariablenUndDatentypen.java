package tag1;

public class _00_VariablenUndDatentypen {
	  void main(String[] args) {
		// Konstante: Mehrwertsteuer
		final double MWST = 0.19;

		// Primitive Typen
		byte anzahlProdukte = 5;            // Anzahl der Produkte im Warenkorb
		short maxBestellwert = 32000;       // Maximaler Bestellwert in Cent
		int kundenAlter = 25;               // Alter des Kunden
		long kundenID = 12345678900L;       // Eindeutige Kunden-ID
		float produktBewertung = 4.5f;      // Durchschnittliche Bewertung eines Produkts
		double warenkorbWert = 59.99;       // Warenkorbwert in Euro
		boolean istVersandKostenfrei = false; // Versandkostenfrei oder nicht
		char kundenGeschlecht = 'F';        // Geschlecht des Kunden

		// Nicht-primitive Typen
		String kundenName = "Anna";         // Name des Kunden
		double[] produktPreise = {19.99, 9.99, 14.99, 4.99}; // Preise der Produkte im Warenkorb

		// Ausgabe der Variablen
		IO.println("Mehrwertsteuer: " + MWST);
		IO.println("Anzahl Produkte im Warenkorb: " + anzahlProdukte);
		IO.println("Maximaler Bestellwert: " + maxBestellwert);
		IO.println("Kundenalter: " + kundenAlter);
		IO.println("Kunden-ID: " + kundenID);
		IO.println("Produktbewertung: " + produktBewertung);
		IO.println("Warenkorbwert: " + warenkorbWert + " €");
		IO.println("Versandkostenfrei? " + istVersandKostenfrei);
		IO.println("Kundengeschlecht: " + kundenGeschlecht);

		IO.println("Kundenname: " + kundenName);
		IO.println("Preis des ersten Produkts: " + produktPreise[0] + " €");
	}
}
