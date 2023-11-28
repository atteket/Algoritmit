package Algoritmit.Demot.Demo3;

public class Solmu {

    public char key;
    public Solmu left;
    public Solmu right;

    public Solmu(char key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public static Solmu luoPuu() {
        Solmu root = new Solmu('A');
        root.left = new Solmu('B');
        root.right = new Solmu('C');
        root.left.left = new Solmu('D');
        root.left.right = new Solmu('E');
        root.right.left = new Solmu('F');
        root.right.right = new Solmu('G');
        root.left.left.left = new Solmu('H');
        root.left.left.right = new Solmu('I');
        root.right.left.left = new Solmu('J');
        return root;
    }

    public static void esiJarjestys(Solmu solmu) {
        if (solmu != null) {
            System.out.print(solmu.key + " ");
            esiJarjestys(solmu.left);
            esiJarjestys(solmu.right);
        }
    }

    public static void sisaJarjestys(Solmu solmu) {
        if (solmu != null) {
            sisaJarjestys(solmu.left);
            System.out.print(solmu.key + " ");
            sisaJarjestys(solmu.right);
        }
    }

    public static void jalkiJarjestys(Solmu solmu) {
        if (solmu != null) {
            jalkiJarjestys(solmu.left);
            jalkiJarjestys(solmu.right);
            System.out.print(solmu.key + " ");
        }
    }

    public static void main(String[] args) {
        Solmu puu = luoPuu();
        System.out.println("Esijärjestys:");
        esiJarjestys(puu);
        System.out.println("\nSisäjärjestys:");
        sisaJarjestys(puu);
        System.out.println("\nJälkijärjestys:");
        jalkiJarjestys(puu);
    }
}
