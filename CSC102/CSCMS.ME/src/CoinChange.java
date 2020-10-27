import java.util.Scanner;
public class CoinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int paid = sc.nextInt();
        int change = paid - price;
        if (price < paid) {
            System.out.println("Change: " + change);
            int a = change / 1000;
            System.out.println("1000THB: " + a);
            change -= (a * 1000);
            int b = change / 500;
            System.out.println("500THB: " + b);
            change -= (b * 500);
            int c = change / 100;
            System.out.println("100THB: " + c);
            change -= (c * 100);
            int d = change / 50;
            System.out.println("50THB: " + d);
            change -= (d * 50);
            int e = change / 20;
            System.out.println("20THB: " + e);
            change -= (e * 20);
            int f = change / 10;
            System.out.println("10THB: " + f);
            change -= (f * 10);
            int g = change / 5;
            System.out.println("5THB: " + g);
            change -= (g * 5);
            int h = change / 2;
            System.out.println("2THB: " + h);
            change -= (h * 2);
            int i = change;
            System.out.println("1THB: " + i);
        } else if (price > paid) {
            System.out.println("Not enough money.");
        } else {
            System.out.println("No change for you.");
        }
    }
}
