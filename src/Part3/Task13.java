package Part3;

// Napisz program, który znajdzie te same elementy w dwóch tablicach zawierających znaki.
// tab1 = ['a', 'b', 'c', 'd', 'e', 'f']
// tab2 = ['c', 'e']
// wynik = b, e

public class Task13 {

    public static void main(String[] args) {

        char tab1[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        char tab2[] = {'c', 'e'};

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                if(tab1[i] == tab2[j]){
                    System.out.println(tab1[i]);
                }
            }
        }
    }
}
