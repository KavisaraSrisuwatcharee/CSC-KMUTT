import java.util.Scanner;

public class MutiMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int matrix1[][] = new int[row1][col1];
        int matrix2[][] = new int[row2][col2];
        int result = 0;
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        if (col1 != row2) {
            System.out.println("Invalid");
        } else {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    result = 0;
                    for (int k = 0; k < col1; k++) {
                        result += matrix1[i][k] * matrix2[k][j];

                    }
                    System.out.print(result + " ");
                }
            }
        }
    }
}
