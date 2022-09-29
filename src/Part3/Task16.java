package Part3;

public class Task16 {

    // Napisz program, który policzy wszystkie liczby parzyste
    // i nieparzyste w tablicy zawierającej liczby całkowiete
    // tab = [2, 3, 4, 5, 6]
    // wynik: parzyste 3, nieparzyste 2

    public static void main(String[] args) {

        int [] numbers = {2, 3, 4, 5, 6};
        int odd = 0;
        int even = 0;

        for (int num:
             numbers ) {
            if(num % 2 == 0){
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
