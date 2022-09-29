package Part3;

// Napisz program, który znajdzie wszystkie pary liczb, których suma jest równa innej liczbie
// tab = [1, 2, 3, 4, 5]
// suma = 5
// wynik 1, 4 i 2,3

public class Task15 {

    public static void main(String[] args) {

        int[]numbers = {1, 2, 3, 4, 5};
        int result = 6;
        for (int i = 0; i < numbers.length; i++){
            for (int j = i +1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == result){
                    System.out.println(numbers[i] + " + " + numbers[j] + " = "+ result);
                }
            }
        }
    }

}
