package Algoritmit.Demot.Demo1;


import java.util.Random;

public class O1 {

    /**
     * Pääohjelma, joka tulostaa eri tulokset annetuilla esimerkkiväleillä.
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        int[] taulukko = randomNumeroTaulukko(100);

        System.out.println("[0, 10]: " + numerotValilla(taulukko, 0, 10));
        System.out.println("[50, 100]: " + numerotValilla(taulukko, 50, 100));
        System.out.println("[67, 75]: " + numerotValilla(taulukko, 67, 75));
    }


    /**
     * Luo halutun kokoisen taulukon ja täyttää sen satunnaisilla luvuilla.
     * @param size taulukon koko
     * @return taulukko kokoa "size" satunnaisilla lukuarvoilla
     */
    private static int[] randomNumeroTaulukko(int size) {
        Random random = new Random();
        int[] taulukko = new int[size];
        for (int i = 0; i < size; i++) {
            taulukko[i] = random.nextInt(101);
        };
        return taulukko;
    }


    /**
     * Hakee annetusta taulukosta, annetulla välillä olevien lukuarvojen määrän.
     * @param taulukko Taulukko, josta lukuarvojen määrää etsitään
     * @param alaRaja Haettujen lukuarvojen alaraja
     * @param ylaRaja Haettujen lukuarvojen yläraja
     * @return Löydettyjen lukuarvojen määrä
     */
    private static int numerotValilla(int[] taulukko, int alaRaja, int ylaRaja) {
        int count = 0;
        for (int numero : taulukko) {
            if (numero >= alaRaja && numero <= ylaRaja) {
                count++;
            };
        };
        return count;
    }
}