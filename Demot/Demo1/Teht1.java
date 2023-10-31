package Algoritmit.Demot.Demo1;

public class Teht1 {

    public static void main(String args[]) {
        System.out.println(onkoJaollinen(5, 2));
        System.out.println(onkoJaollinen(6, 2));
        System.out.println(onkoJaollinen(100, 2));
        System.out.println(alkuMerkitPerakkain("testi"));
        System.out.println(alkuMerkitPerakkain(""));
        System.out.println(alkuMerkitPerakkain("aaron"));

    }

    public static boolean onkoJaollinen(int jaettava, int jakaja) {
        if (jakaja == 0) return false;
        if (jaettava == 0) return true;
        int jakojaannos = jaettava;
        while (jakojaannos >= jakaja) {
            jakojaannos -= jakaja;
        }
        return jakojaannos == 0;
    }

    public static int alkuMerkitPerakkain(String s) {
        if (s == null|| s.length() == 0) return 0;
        int count = 0;
        char eka = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c == eka) count++;
            else break;
        }
        return count;
    }
}