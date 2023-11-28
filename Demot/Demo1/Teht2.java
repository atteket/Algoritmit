package Algoritmit.Demot.Demo1;
import java.util.Arrays;

public class Teht2 {

    public static void main(String args[]) {
        int[] taulukko = {1, 2, 3, 4, 5};
        System.out.println(suurinJaPieninSumma(taulukko));
        taulukko = new int[] {};
        System.out.println(suurinJaPieninSumma(taulukko));
        taulukko = new int[] {-2, 0, 3, 5, 4, 6, 100};
        System.out.println(suurinJaPieninSumma(taulukko));
        taulukko = new int[] {1, 1, 1, 2, 3, 3, 3};
        System.out.println(poistaDuplikaatit(taulukko));
        System.out.println(Arrays.toString(taulukko));
        taulukko = new int[] {1, 2, 3};
        System.out.println(poistaDuplikaatit(taulukko));
    }


    public static int suurinJaPieninSumma(int[] taulukko) {
        if(taulukko == null || taulukko.length == 0) return 0;
        int suurin = taulukko[0];
        int pienin = taulukko[0]; 
        for( int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] > suurin) suurin = taulukko[i];
            if (taulukko[i] < pienin) pienin = taulukko[i];
        }
        
        return suurin + pienin;
    }


    public static int poistaDuplikaatit(int[] taulukko) {
        if(taulukko == null || taulukko.length == 0) return 0;
        int poistetut = 0;
        int edellinen = taulukko[0];
        for( int i = 1; i < taulukko.length; i++ ) {
            if (taulukko[i] == edellinen) {
                poistetut++;
                taulukko[i] = 0;
            }
            else edellinen = taulukko[i];
        }
        return poistetut;
    }

}
