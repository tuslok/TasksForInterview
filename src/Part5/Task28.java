package Part5;

public class Task28 {

    public static void main(String[] args) {
        String text = "Szybki brązowy lis przeskakuje nad leniwym psem.";

        String [] tab = text.split(" ");
        String replace = "lis";
        String newText = "kuń";

        for (int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + " ");
            if(tab[i].equals(replace)){
                tab[i] = newText;
            }
        }

        System.out.println(" ");

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
