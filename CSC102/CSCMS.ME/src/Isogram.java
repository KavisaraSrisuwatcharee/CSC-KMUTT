import java.util.Scanner;

public class Isogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String words=word.toLowerCase();
        for (int i = 0; i < words.length(); i++) {
            for (int j = i + 1; j < words.length(); j++) {
                if (words.substring(i, i + 1).equals(words.substring(j, j + 1)) && words.substring(i,i+1).equals(" ")==false && words.substring(i,i+1).equals("-")==false) {
                    System.out.println(word + " is not an isogram");
                    return;
                }
            }
        }
        System.out.println(word + " is an isogram");
    }
}

