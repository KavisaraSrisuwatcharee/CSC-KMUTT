import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Boxs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        int [] arr1={a1,b1,c1};
        int [] arr2={a2,b2,c2};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1[0]>arr2[0] || arr1[1]>arr2[1] || arr1[2]>arr2[2]){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }


}
