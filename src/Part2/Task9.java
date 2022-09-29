package Part2;

// Napisz program, który usunie dany element z tablicy liczb całkowitych
// Tablica zawiera tylko unikalne elementy
// numbers: [1, 2, 3, 4, 5, 6]
// liczba do usunięcia: 5
// wynik: [1, 2, 3, 4, 6]

public class Task9 {

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6};
        int numberToRemove = 5;
        int newNumbers = numbers[numbers.length - 1];

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == numberToRemove){
                continue;
            } else {

            }
        }

    }
}
