package tag6._03_Vererbung;

public class Pudel extends Hund {

    boolean magAndereHunde;

    public Pudel(String name, int alter, boolean magAndereHunde) {
        super(name, alter);
        this.magAndereHunde = magAndereHunde;
    }

    public String info() {
        return super.info() + " und mag andere Hunde: " + magAndereHunde;
    }
}
