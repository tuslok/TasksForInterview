package Part2;

// Napisz program, który znajdzie takie same wartości w tablicy liczb całkowitych
// tab: [1, 2, 3, 2, 3, 4, 5, 6, 6]
// wynik: [2, 3, 6]
public class Task12 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 2, 3, 4, 5, 6, 6};
        int value;
        for (int i = 0; i < numbers.length; i++) {
            value = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if(value == numbers[j]) {
                    System.out.println(value);
                }
            }
        }
    }
}

