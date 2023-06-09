package rendezesek_dolgozat;

public class Rendezes {

    private static int[] szamok = {6, 4, 2, 1, 8, 7, 3, 9, 5, 10};
    private static int[] rendezetlen = {1, 3, 2};

    public static void main(String[] args) {
        kiir(rendez(szamok));
        Teszt teszt1 = new Teszt();
        teszt1.rendezettE(rendez(szamok));
        //teszt1.rendezettE(rendezetlen);
    }

    public static int[] rendez(int[] tomb) {
        do {
            for (int i = 0; i < tomb.length - 1; i++) {
                if (tomb[i] > tomb[i + 1]) {
                    int seged = tomb[i];
                    tomb[i] = tomb[i + 1];
                    tomb[i + 1] = seged;
                }
            }
        } while (!ellenoriz(tomb));

        return tomb;
    }

    public static boolean ellenoriz(int[] tomb) {
        boolean rendezett = true;
        for (int i = 0; i < tomb.length - 1; i++) {
            if (tomb[i] > tomb[i + 1]) {
                rendezett = false;
            }
        }

        return rendezett;
    }

    private static void kiir(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println("");
    }

}
