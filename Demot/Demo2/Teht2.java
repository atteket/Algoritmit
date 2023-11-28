package Algoritmit.Demot.Demo2;

// Luokassa oletetaan, että on käytössä tarvittavat pino-operaatiot push, pop, isEmpty, size ja top.
// Oletetaan myös, että taulukot ovat int[] taulukoita, joille operaatiot on määritelty.
public class Teht2 {
    public static void operate(int[] taul, char operation) {
        if (size(taul) < 2) {
            System.out.println("Taulukossa ei ole kahta alkiota, ei voi suorittaa operaatiota operate.");
            return;
        }
        int tulos = 0;
        int luku1 = pop(taul);
        int luku2 = pop(taul);
        switch(operation) {
            case '*': {
                tulos = luku1 * luku2;
                break;
            }
            case '+': {
                tulos = luku1 + luku2;
                break;
            }
            case '-': {
                tulos = luku1 - luku2;
                break;
            }
            case '/': {
                tulos = luku1 / luku2;
                break;
            }
        }
        push(taul, tulos);
    }

    public static void sink(int[] taul) {
        if(isEmpty(taul)) {
            System.out.println("Taulukko tyhjä, ei voi suorittaa operaatiota sink.");
            return;
        }
        int top = pop(taul);
        int[] apuTaul = new int[size(taul)];
        while(!isEmpty(taul)) {
            int pushattava = pop(taul);
            push(apuTaul, pushattava);
        }
        push(taul, top);
        while(!isEmpty(apuTaul)) {
            int pushattava = pop(apuTaul);
            push(taul, pushattava);
        }
        return;
    }

    public static void flip(int[] taul) {
        if(size(taul) < 1) {
            System.out.println("Taulukossa ei ole tarpeeksi alkioita, ei voi suorittaa operaatiota flip.");
            return;
        }
        int[] apuTaul = new int[size(taul)];
        while(!isEmpty(taul)) {
            int pushattava = pop(taul);
            push(apuTaul, pushattava);
        }
        for(int i = 0; i < size(apuTaul); i++) {
            taul[i] = apuTaul[size(apuTaul) - 1 - i];
        }
        return;
    }
}
