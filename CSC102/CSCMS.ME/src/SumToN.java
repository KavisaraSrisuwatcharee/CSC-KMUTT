import java.util.Scanner;
public class SumToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long sum=sc.nextLong();
        System.out.println((sum*(sum+1))/2);
    }
}
