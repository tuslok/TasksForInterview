package Part1;

// Napisz program, który zamieni pierwszy i ostatni element w tablicy
// tab1: [1, 3, 5, 4]
// wynik: [4, 3, 5, 1]

public class Task5 {
    public static void main(String[] args) {

        int tab1[] = {1, 3, 5, 4};

        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " ");
        }
        System.out.println();
        /*
        Solution number 1

        int last = tab1[tab1.length - 1]; // last = 4
        tab1[tab1.length - 1] = tab1[0];
        tab1[0]= last;


        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " ");
        }*/

        // Solution number 2

        tab1[0] = tab1[0] + tab1[tab1.length - 1]; // tab[0] = 5
        tab1[tab1.length-1] = tab1[0] - tab1[tab1.length - 1];
        tab1[0] = tab1[0] - tab1[tab1.length - 1];
        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " ");
        }

    }
}
