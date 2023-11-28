Package Algoritmit.Demot.Demo4
import java.util.Random;

public class LajitteluAlgoritmit {

    public static void kuplaLajittelu(int[] taulukko) {
        int n = taulukko.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (taulukko[j] > taulukko[j + 1]) {
                    int temp = taulukko[j];
                    taulukko[j] = taulukko[j + 1];
                    taulukko[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] taulukko, int alku, int loppu) {
        if (alku < loppu) {
            int osaIndex = ositus(taulukko, alku, loppu);
            quickSort(taulukko, alku, osaIndex - 1);
            quickSort(taulukko, osaIndex + 1, loppu);
        }
    }

    private static int ositus(int[] taulukko, int alku, int loppu) {
        int kaanne = taulukko[loppu];
        int i = (alku - 1);
        for (int j = alku; j < loppu; j++) {
            if (taulukko[j] <= kaanne) {
                i++;
                int temp = taulukko[i];
                taulukko[i] = taulukko[j];
                taulukko[j] = temp;
            }
        }
        int temp = taulukko[i + 1];
        taulukko[i + 1] = taulukko[loppu];
        taulukko[loppu] = temp;
        return i + 1;
    }

    public static int[] randomTaulukko(int koko) {
        Random rand = new Random();
        int[] taulukko = new int[koko];
        for (int i = 0; i < koko; i++) {
            taulukko[i] = rand.nextInt(100);
        }
        return taulukko;
    }

    public static void printTaulukko(int[] taulukko) {
        for (int arvo : taulukko) {
            System.out.print(arvo + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] taulukko = randomTaulukko(10);
        System.out.println("Alkuperäinen taulukko:");
        printTaulukko(taulukko);

        int[] kuplaLajitteluTaulukko = taulukko.clone();
        kuplaLajittelu(kuplaLajitteluTaulukko);
        System.out.println("Kuplalajiteltu taulukko:");
        printTaulukko(kuplaLajitteluTaulukko);

        int[] quickSortTaulukko = taulukko.clone();
        quickSort(quickSortTaulukko, 0, quickSortTaulukko.length - 1);
        System.out.println("Pikalajiteltu taulukko:");
        printTaulukko(quickSortTaulukko);
    }
}