import java.util.Scanner;

public class Spinkle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        String arr[] = new String[row];
        int new_arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i].charAt(j) == 'S'){
                    for(int k=0;k<row;k++){

                    }
                    new_arr[i][j]=1;
                    System.out.print(new_arr[i][j]+" ");
                }else{
                    new_arr[i][j]=0;
                    System.out.print(new_arr[i][j]+" ");
                }
            }
            System.out.println("");
        }
    }
}
