package Part1;

// Napisz program, który przesunie wszystkie elementy tablicy o jedno miejsce w lewo
// Tablica składa się z liczb całkowitych. Rozmiar tablicy = 3.
// tab: [20, 30, 40]
// wynik: [30, 40, 20]

public class Task6 {

    public static void main(String[] args) {

        int tab[] = {20, 30, 40};
        int[] result = new int [3];

        for (int i = 0; i < tab.length; i++) {
            if(i == 0){
                result[result.length - 1] = tab[0];
            } else{
                result[i - 1] = tab[i];
            }
        }

        for (int number:
             result ) {
            System.out.print(number + " ");
        }

    }
}
