package Algoritmit.Demot.Demo3;

public class Binaaripuu {
    Solmu juuri;

    public Binaaripuu() {
        juuri = null;
    }

    public Binaaripuu(Solmu juuriSolmu) {
        juuri = juuriSolmu;
    }

    static class Solmu {
        int key;
        Solmu oikea;
        Solmu vasen;

        public Solmu(int arvo) {
            key = arvo;
            oikea= vasen = null;
        }

        public Solmu(int arvo, Solmu oikeaJalkelainen, Solmu vasenJalkelainen) {
            key = arvo;
            oikea = oikeaJalkelainen;
            vasen = vasenJalkelainen;
        }
    }

    public static int etaisyys(Solmu p, int juurenArvo) {
        if(p == null) return Integer.MIN_VALUE;

        int etaisyys = Math.abs(juurenArvo - p.key);

        int vasen = etaisyys(p.vasen, juurenArvo);
        int oikea = etaisyys(p.oikea, juurenArvo);

        return Math.max(etaisyys, Math.max(vasen, oikea));
    }

    public int suurinEtaisyys() {
        return etaisyys(juuri, juuri.key);
    }

    public static void main(String[] args) {
        Binaaripuu puu = new Binaaripuu();
        puu.juuri = new Solmu(40);
        puu.juuri.vasen = new Solmu(20);
        puu.juuri.oikea = new Solmu(60);
        puu.juuri.vasen.vasen = new Solmu(30);
        puu.juuri.vasen.oikea = new Solmu(10);
        puu.juuri.oikea.vasen = new Solmu(50);
        puu.juuri.oikea.oikea = new Solmu(100);
        puu.juuri.vasen.vasen.vasen = new Solmu(10);

        int tulostus = puu.suurinEtaisyys();

        System.out.println(tulostus);
    }

}
