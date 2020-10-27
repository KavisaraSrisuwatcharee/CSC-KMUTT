import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for(int i=2;i<=n;i++){
            count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }

    }

}
//    int n = sc.nextInt();
//        for(int i=2;i<=n;i++){
//                int j;
//                for(j=2;j<i;j++){
//        if(i%j==0){
//        break;
//        }
//        }
//        if(i==j){
//        System.out.print(i+" ");
//        }
//
//        }

//    int n = sc.nextInt();
//    boolean check=false;
//        for(int i=2;i<=n;i++){
//                check=false;
//                for(int j=2;j<i;j++){
//        if(i%j==0){
//        check=true;
//        break;
//        }
//        }
//        if(check==false){
//        System.out.print(i+" ");
//        }
//        }
