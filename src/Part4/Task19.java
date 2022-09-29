package Part4;

// Napisz program, który znajdzie takie same elementy położone obok siebie.
// tab = {a, b, c, d, d, c, b, a}
// wynik: d d

public class Task19 {
    public static void main(String[] args) {

        char[] tab = {'a', 'b', 'c', 'd', 'd', 'c', 'b', 'a'};

        for (int i = 0; i < tab.length; i++){
            if(i == tab.length - 1){
                break;
            }
            if(tab[i] == tab[i + 1]){
                System.out.println("The same: " + tab[i] + " " + tab[i+1]);
            }
        }

    }
}
