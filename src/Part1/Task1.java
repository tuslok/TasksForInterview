package Part1;

public class Task1 {

    public static void main(String[] args) {

        // napisz program, który sprawdzi pierwszy i ostatni element
        // w tablicy zawierającej liczby całkowite czy są takie same
        // tab = [1, 2, 3, 1] - true
        // tab = [1, 2, 4, 5] - true

        int [] tab = {1, 2, 3, 5};

        System.out.println("Długość tablicy: " + tab.length);
        System.out.println("Pierwszy element tablicy: " + tab[0]);
        System.out.println("Pierwszy element tablicy: " + tab[tab.length - 1]);

        if(tab[0] == tab[tab.length - 1]){
                System.out.println("Pierwszy i ostani element są takie same.");
        } else {
            System.out.println("Pierwszy i ostatni element są różne.");
        }

    }

}
