import java.util.Scanner;

public class Bomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cart = sc.nextInt();
        int bomb = sc.nextInt();
        int[] arr = new int[cart];
        for (int i = 0; i < arr.length; i++) {
            if (bomb == i - 1) {
                arr[i - 1] = 1;
                arr[i - 2] = 1;
                arr[i] = 1;
            }
            if (arr[i] == 0) {
                System.out.print(i + 1 + " ");
            }
        }
    }
}
