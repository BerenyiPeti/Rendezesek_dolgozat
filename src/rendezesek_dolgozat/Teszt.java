package rendezesek_dolgozat;

public class Teszt {

    public Teszt() {
    }

    public boolean ellenoriz(int[] tomb) {
        boolean rendezett = false;
        int i = 0;
        while (i < tomb.length - 1 && tomb[i] <= tomb[i + 1]) {
            i++;
        }

        if (i == tomb.length - 1) {
            rendezett = true;
        }
        return rendezett;
    }

    public void rendezettE(int[] tomb) {
        boolean vart = true;
        boolean kapott = ellenoriz(tomb);

        assert vart = kapott : "a tömb nem rendezett";

    }

}
