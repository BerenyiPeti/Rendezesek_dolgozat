package rendezesek_dolgozat;

public class Teszt {

    public Teszt() {
    }

    public boolean ellenoriz(int[] tomb) {
        boolean rendezett = true;
        for (int i = 0; i < tomb.length - 1; i++) {
            if (tomb[i] > tomb[i + 1]) {
                rendezett = false;
            }
        }

        return rendezett;
    }

    public void rendezettE(int[] tomb) {
        boolean vart = true;
        boolean kapott = ellenoriz(tomb);

        assert vart = kapott : "a tömb nem rendezett";

    }

}
