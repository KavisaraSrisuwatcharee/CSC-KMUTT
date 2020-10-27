import java.util.Arrays;
import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStu = sc.nextInt();
        int[] arr = new int[numStu];
        int percent = 0;
        Arrays.sort(arr);
        int index=0;
        for (int i = 0; i < numStu; i++) {
            arr[i] = sc.nextInt();
            int a = 90;
            int b = 70;
            int c = 50;
            int d = 30;
            int e = 10;
            int f = 0;

        }

    }
}
