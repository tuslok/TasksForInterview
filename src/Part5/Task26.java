package Part5;

// Napisz program, który sprawdzi czy tekst kończy się tak jak inny tekst.
// Java is fun
// Wynik: fun -> true
// Wynik: fum -> false

public class Task26 {

    public static void main(String[] args) {
        String str = "Java is fun";
        String subStr = "fun";

        String[] one = str.split("");
        String[] two = subStr.split("");
        boolean isTheSame = true;

        int index = one.length - two.length;
        System.out.println(index);

        for(int i = index, k = 0; i < one.length; i++){
            if (!one[i].equals(two[k++])){
                isTheSame = false;
            }
        }

        if(isTheSame){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
