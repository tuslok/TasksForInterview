package Part2;

// Napisz program, który znajdzie maksymalną i minimalną wartość w tablicy
// zawierającej liczby całkowite
// tab: [8, 9, 2, 6, 5]
// min = 2, max = 9

public class Task11 {
    public static void main(String[] args) {
        int numbers[] = {8, 9, 2, 6, 5};
        int min = numbers[0];
        int max = numbers[0];
        
        
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
