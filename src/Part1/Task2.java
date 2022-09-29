package Part1;

public class Task2 {

    // Mając dwie tablic zawierające liczby całkowite, napisz program, który spradzi
    // czy pierwzy i ostatni element z pierwszej tablicy są takie same
    // jak pierwszy i ostatni element z drugiej tablicy.

    public static void main(String[] args) {
        int [] tab1 = {0, 2, 3};
        int [] tab2 = {1, 2, 3};


        if(tab1[0] == tab2[0] && tab1[tab1.length-1] == tab2[tab2.length-1]){
            System.out.println("Elementy są takie same");
        } else {
            System.out.println("Elementy są różne.");
        }
    }
}
