package tag4;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class GaestelisteManager {
    public static void main(String[] args) {

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
