import java.util.Scanner;

public class Sieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = 1;
        }
        for (int i = 2; i < Math.floor(Math.sqrt(n)); i++) {
            if (arr[i] != 0) {
                int j = i * i;
                while (j <= n) {
                    arr[j] = 0;
                    j += i;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (arr[i] != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
