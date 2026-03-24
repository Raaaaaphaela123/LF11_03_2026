package tag2;

public class _05_Ternaerer_Operator {
    static void main() {

        // auch Konditionaloperator
        // Kurzform für einfache if-else Entscheidungen
        // Syntax: Bedingung ? WertWennTrue : WertWennFalse

        int kundenAlter = 19;
        // Zugangsprüfung zum Club
        //boolean hatZutritt = (kundenAlter >= 18) ? true : false;
        String hatZutritt = (kundenAlter >= 18) ? "ja" : "nein";

        IO.println("Kunde hat Zutritt: " + hatZutritt);

        // Hinweis:
        // Der Konditionaloperator ist ideal für einfache, übersichtliche Bedingungen,
        // ersetzt jedoch keine komplexen if-Strukturen.

        // bitte nicht tief verschachtelt, dann besser if-else:
        int note = 5;
        int benoetigteZeitInMin = 120;

        boolean hatBestanden = (kundenAlter <= 18) ? false : note > 5 ? false : benoetigteZeitInMin > 120 ? false : true;
    }

}
