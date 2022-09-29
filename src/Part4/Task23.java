package Part4;

// Napisz program, który znajdzie liczby większe niż średnia wszystkich liczb w tablicy
// tab = {1, 4, 15, 7, 25, 3, 99}
// średnia = 22
// szukane liczby = 25 i 99

public class Task23 {

    public static void main(String[] args) {

        int tab[] = {1, 4, 15, 7, 25, 3, 99};
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum = sum + tab[i];
        }

        int avg = sum / tab.length;
        //System.out.println(avg);

        for (int i =0; i < tab.length; i++) {
            if (tab[i] > avg){
                System.out.println(tab[i]);
            }
        }
    }
}

