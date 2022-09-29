package Part4;

// Napisz program, który wyświetli znak na podanym indeksie
// String str = "Java is fun"
// index 5 = i

public class Task24 {
    public static void main(String[] args) {

        String str = "Java is fun";
        int index = 5;

        System.out.println(str.charAt(index));


        String[] tab = str.split("");

        for (int i = 0; i < str.length(); i++) {
            if (i == index){
                System.out.println(tab[i]);
            }
        }
    }
}
