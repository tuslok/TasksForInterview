package Part1;

public class Task3 {

    // Mając dwie tablice napisz program , który utworzy trzecią, dwuelementową tablicę
    // która będzie składa się z pierwszego elementu pierwszej tablicy
    // i ostatniego elementu z drugiej tablicy


    public static void main(String[] args) {

        int [] tab1 = {0, 2, 3, 4};
        int [] tab2 = {1, 2, 3, 7};
        int [] tab3 = new int [2];

        tab3[0] = tab1[0];
        tab3[tab3.length - 1] = tab2[tab2.length - 1];

        for (int i = 0; i < tab3.length; i++){
            System.out.println(tab3[i] + " ");
        }

        for (int number :
             tab3) {
            System.out.print(number);
        }

    }
}
