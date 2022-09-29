package Part3;

// Napisz program, który sprawdzi czy tablica liczb całkowitych zawiera dwa elementy np. 65 i 77
// tab = [1, 2, 65, 5, 77, 90, 0] -> true
// tab1 = [1, 2, 65, 5, 78, 90, 0] -> false

public class Task18 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 65, 5, 77, 90, 0};

        int num1 = 65;
        int num2 = 77;
        int counter = 0;

        for (int i = 0; i < numbers.length; i++){
            if(num1 == numbers[i] || num2 == numbers[i]){
                counter++;
            }
        }

        if (counter == 2){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
