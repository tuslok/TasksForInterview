package Part1;

public class Task4 {

    // Napisz program, który pomnoży odpowiadające sobie elementy dwóch tablic.
    // Obie tablice są tej samej długości.
    // tab1: [1, 3, 5, 4]
    // tab2: [1, 4, 5, 2]
    // Wynik 1 12 25 8

    public static void main(String[] args) {

        int tab1[] = {1, 3, 5, 4};
        int tab2[] = {1, 4, 5, 2};

        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] * tab2[i] + " ");
        }

    }

}
