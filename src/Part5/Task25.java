package Part5;

// Napisz program, który sprawdzi czy tekst zaczyna się od innego tekstu
// Java is fun
// Wynik: Jav -> true
// Wynik: Jam -> false
public class Task25 {

    public static void main(String[] args) {
        String str = "Java is fun";
        String subStr = "Jav";

        // Solution 1
        //System.out.println(str.startsWith(subStr));

        // Solution 2
        String[] tabStr = str.split("");
        String[] tabSubStr = subStr.split("");
        boolean isTheSame = false;

        for(int i = 0; i < tabSubStr.length; i++){
            if(!(tabStr[i] == tabSubStr[i])){
                isTheSame = true;
            }
        }

        if(isTheSame){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
