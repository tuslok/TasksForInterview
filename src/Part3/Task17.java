package Part3;

// Napisz program, który sprawdzi czy suma co trzeciego elementu w tablicy = 10
// Zwróc true jeśli tak, false jeżeli nie.
// tab1 = {1, 2, (3), 1, 2, (3), 1, 2, (4)} - true

public class Task17 {

    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 1, 2, 3, 1, 2, 4};
        int sum = 0;

        for(int i = 1; i <= numbers.length; i++){
            if(i % 3 == 0){
                sum = sum + numbers[i-1];
            }
        }

        if(sum == 10){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
