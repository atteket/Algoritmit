package Algoritmit.Demot.Demo2;

public class Jono {
    private int[] taulukko;
    private int eka;
    private int vika;
    private int koko;

    public Jono(int max) {
         taulukko = new int[max];
            eka = 0;
            vika = -1;
            koko = 0;
        }

    public void enqueue(int item) {
        if (taulukko.length == vika + 1) {
            System.out.println("Jono täynnä, ei voi lisätä alkiota!");
            return;
        }
        vika = (vika + 1);
        taulukko[vika] = item;
        koko++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Jono tyhjä, ei poistettavaa alkiota!");
            return -1;
        }
        int poistettu = taulukko[eka];
        eka = (eka + 1) % taulukko.length;
        koko--;
        return poistettu;
    }

    public boolean isEmpty() {
        return koko == 0;
    }

    public int koko() {
        return koko;
    }

    public int eka() {
        if (isEmpty()) {
            return -1;
        }
        return taulukko[eka];
    }

    public static void main(String[] args) {
        Jono jono = new Jono(3);

        jono.enqueue(1);
        jono.enqueue(2);
        jono.enqueue(3);
        jono.enqueue(4);

        System.out.println("Eka alkio: " + jono.eka());
        System.out.println("Jonon koko: " + jono.koko());

        while (!jono.isEmpty()) {
            System.out.println("Poistettiin alkio: " + jono.dequeue());
        }
        jono.dequeue();

        System.out.println("Onko jono tyhjä: " + jono.isEmpty());
    }
}
