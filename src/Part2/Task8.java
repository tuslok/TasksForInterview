package Part2;

// Napisz program, który policzy sumę wszystkich elementów tablicy zawierającej liczby całkowite
// numbers: [1, 2, 3, 4, 5]
// wynik: 15

public class Task8 {

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
