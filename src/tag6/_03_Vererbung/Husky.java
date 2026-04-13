package tag6._03_Vererbung;

public class Husky extends Hund {
    boolean kannSchlittenZiehen;

    // Konstruktor
    public Husky (String name, int alter, boolean kannSchlittenZiehen) {
        super(name, alter);
        this.kannSchlittenZiehen = kannSchlittenZiehen;
    }

    public String info() {
        return super.info() + " und kann Schlitten ziehen: " + kannSchlittenZiehen;
    }

}
