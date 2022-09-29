package Part4;

// Napisz program, który policzy jakich liczb jest najwięcej.
// tab = {1, 1, 3, 2, 2, 7, 4, 5, 7, 5, 7, 20}
// Odpowiedź: najwięcej jest 7 - 3x

public class Task20 {

    public static void main(String[] args) {
        int []tab = {1, 1, 3, 2, 2, 7, 4, 5, 7, 5, 7, 20};

        int maxValue = 0;
        for(int i = 0; i < tab.length; i++) {
            maxValue = tab[i];
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] > maxValue){
                    maxValue = tab[j];
                }
            }
        }


    }
}
