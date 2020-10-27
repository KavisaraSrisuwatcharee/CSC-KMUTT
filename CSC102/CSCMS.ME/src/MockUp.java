import java.util.Scanner;
import java.lang.String;

//public class MockUp {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name1 = sc.next();
//        String name2 = sc.next();
//        String names = name2.toLowerCase();
//        String namess=name1.toLowerCase();
//        if (name1.equals(names)) {
//            System.out.print("Partial Match");
//        } else if (name1.equals(name2)) {
//            System.out.print("Perfect Match");
//        } else if (names.contains(namess) || namess.contains(names)) {
//            System.out.print("Partial Match");
//        } else {
//            System.out.print("Not Match");
//        }
//    }
//}
//public class MockUp {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        int n = sc.nextInt();
//        if(name.length()>n) {
//            for (int i = 0; i < n; i++) {
//                System.out.print(name.charAt(i));
//
//            }
//            System.out.print("...");
//        }else{
//            System.out.print(name.substring(0,name.length()));
//        }
//    }
//}
public class MockUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        String name2 = sc.nextLine();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int max1=Math.max(a,Math.max(b,c));
        int min1=Math.min(a,Math.min(b,c));
        int mid1 =a+b+c-max1-min1;
        int max2=Math.max(d,Math.max(e,f));
        int min2=Math.min(d,Math.min(e,f));
        int mid2 =d+e+f-max2-min2;
        int win1=0;
        int win2=0;
        if(max1>max2){
            win1+=1;
        }else if(max1<max2){
            win2+=1;
        }
        if (min1>min2){
            win1+=1;
        }else if (min1<min2){
            win2+=1;
        }
        if(win1==2){
            System.out.println("Perfect Win (" + name1 + ")");
        }else if (win2==2){
            System.out.println("Perfect Win (" + name2 + ")");
        }else{
            if (mid1>mid2){
                win1+=1;
            }else if (mid1<mid2){
                win2+=1;
            }
            if(win1>win2){
                System.out.println("Win (" + name1 + ")");
            }else if(win2>win1){
                System.out.println("Win (" + name2 + ")");
            }else{
                System.out.println("Draw");
            }
        }
    }
}

//public class MockUp{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner (System.in);
//        int x=sc.nextInt();
//        int y=sc.nextInt();
//        int n=sc.nextInt();
//        int k=(n-y)/x;
//        System.out.print(x*k+y);
//    }
//}
