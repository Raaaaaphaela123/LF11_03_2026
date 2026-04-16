import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Tag4_Aufgaben {


    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<>();
//
//        while (true) {
//            String produkt = JOptionPane.showInputDialog("Einkaufsliste erstellen.\n" +
//                    "Gib ein Produkt ein (oder 'fertig' zum Beenden):");
//
//            if (produkt == null || produkt.equalsIgnoreCase("fertig")) {
//                break;
//            }
//            list.add(produkt);
//        }
//
//        String aktuelleListe = "Deine Einkaufsliste (" + list.size() + " Artikel):\n" + String.join("\n", list);
//        JOptionPane.showMessageDialog(null, aktuelleListe);
//
//
//        while (!list.isEmpty()) {
//            String zuEntfernen = JOptionPane.showInputDialog(aktuelleListe +
//                    "\n\nWelches Produkt möchtest du entfernen? (oder 'fertig'):");
//
//            if (zuEntfernen == null || zuEntfernen.equalsIgnoreCase("fertig")) {
//                break;
//            }
//
//
//            if (list.contains(zuEntfernen)) {
//                list.remove(zuEntfernen);
//                JOptionPane.showMessageDialog(null, zuEntfernen + " wurde entfernt.");
//            } else {
//                JOptionPane.showMessageDialog(null, "Fehler: '" + zuEntfernen + "' ist nicht in der Liste!");
//            }
//
//
//            aktuelleListe = "Deine Einkaufsliste (" + list.size() + " Artikel):\n" + String.join("\n", list);
//        }
//
//
//        if (list.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Die Einkaufsliste ist jetzt leer.");
//        } else {
//            JOptionPane.showMessageDialog(null, "Finale Einkaufsliste:\n" + String.join("\n", list));
//        }
//
//        IO.println("#".repeat(20) + "\n");

        // GaestelisteManager


        var gaesteliste = new ArrayList<String>();


        gaesteliste.add("Anna");
        gaesteliste.add("Ben");
        gaesteliste.add("Clara");
        gaesteliste.add("Daniel");
        gaesteliste.remove("Daniel");


        int benIndex = gaesteliste.indexOf("Ben");
        if (benIndex != -1) {
            gaesteliste.set(benIndex, "Ben & Begleitung");
        }

        if (gaesteliste.contains("Anna")) {
            JOptionPane.showMessageDialog(null, "Anna steht auf der Liste!");
        }


        System.out.println("Aktuelle Anzahl der Gäste: " + gaesteliste.size());


        String finaleListe = "Finale Gästeliste:\n";
        for (var gast : gaesteliste) {
            finaleListe += "- " + gast + "\n";
            System.out.println(gast);
        }

        JOptionPane.showMessageDialog(null, finaleListe);










    }
}
