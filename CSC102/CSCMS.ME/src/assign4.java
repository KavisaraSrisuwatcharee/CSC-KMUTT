import java.util.Scanner;
import java.util.Stack;

public class assign4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solveHanoi(n);
    }
    public static void solveHanoi(int n) {
        Stack<Integer> a = new Stack<Integer>();
        Stack<Integer> b = new Stack<Integer>();
        Stack<Integer> c = new Stack<Integer>();
        for (int i = n; i >= 1; i--) {
            a.push(i);
        }int round = (int) Math.pow(2, n) - 1;
        for (int i = 1; i <= round; i++) {
            System.out.println("Round: " + i);
            if (i % 3 == 1) {
                if (a.empty()) a.push(c.pop());
                else if (c.empty()) c.push(a.pop());
                else if (a.peek() < c.peek()) c.push(a.pop());
                else a.push(c.pop());
            } else if (i % 3 == 2) {
                if (a.empty()) a.push(b.pop());
                else if (b.empty()) b.push(a.pop());
                else if (a.peek() < b.peek()) b.push(a.pop());
                else a.push(b.pop());
            } else {
                if (c.empty()) c.push(b.pop());
                else if (b.empty()) b.push(c.pop());
                else if (c.peek() < b.peek()) b.push(c.pop());
                else c.push(b.pop());
            }printPole(a, b, c, n);
        }
    }
    public static void printPole(Stack<Integer> a, Stack<Integer> b, Stack<Integer> c, int n) {
        Stack<Integer> ac = (Stack<Integer>) a.clone();
        Stack<Integer> bc = (Stack<Integer>) b.clone();
        Stack<Integer> cc = (Stack<Integer>) c.clone();
        Stack<Integer>[] ms = (Stack<Integer>[]) new Stack[3];
        ms[0] = ac; ms[1] = bc; ms[2] = cc;
        if (n % 2 == 0) {
            ms[1] = cc;  ms[2] = bc;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if (ms[j].size() + i == n)
                    System.out.print(ms[j].pop());
                else System.out.print("|");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
