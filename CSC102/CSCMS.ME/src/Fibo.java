import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index[] = new int[num+2];
        index[0] = 0;
        index[1] = 1;
        for (int i = 0; i < num; i++) {
            index[i+2]=index[i]+index[i+1];
            System.out.print(index[i] + " ");
        }
    }
}

