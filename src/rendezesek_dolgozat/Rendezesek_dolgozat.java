package rendezesek_dolgozat;

public class Rendezesek_dolgozat {

    private static int[] szamok = {5, 8, 24, 21, 2, 6, 1, 7, 23, 3};

    public static void main(String[] args) {
        kiir(rendez(szamok));
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
            System.out.println(tomb[i]);
        }
    }

}
