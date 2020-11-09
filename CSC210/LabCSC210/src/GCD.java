public class GCD {
//    public static void main(String[] args) {
//        System.out.println(highSchoolGCD(16, 20));
//        System.out.println(commonFactorGCD(60, 60));
//        int[] primeList = new int[100];
//        prime(100,primeList);
//        for (int a : primeList) {
//            System.out.print((a != 0 ? a : "") + " ");
//        }
//        System.out.println(Euclid(60,24));
//        System.out.println(recursiveEuclid(20,15));
//    }

//    public static int bruteForceGCD(int m, int n) {
//        int answer = 1;
//        for (int x = 2; x <= Math.min(m, n); x++) {
//            if (m % x == 0 && n % x == 0) {
//                answer = x;
//            }
//        }
//        return answer;
//    }
//
//    public static int highSchoolGCD(int m, int n) {
//        int answer = 1;
//        for (int i = 2; i < Math.min(m, n); i++) {
//            while (m % i == 0 && n % i == 0) {
//                m /= i;
//                n /= i;
//                answer *= i;
//            }
//        }
//        return answer;
//    }
//
//    public static int commonFactorGCD(int m, int n) {
//        int answer = 1;
//        int maxFactors = (int) (Math.log(m) / Math.log(2)); //lg m base 2
//        int[] factors4m = new int[maxFactors];
//        factors(m, factors4m);
//        maxFactors = (int) (Math.log(n) / Math.log(2)); //lg m base 2
//        int[] factors4n = new int[maxFactors];
//        factors(n, factors4n);
//        int pointM = 0, pointN = 0;
//        while (factors4m[pointM] != -1 && factors4n[pointN] != -1 && pointM < factors4m.length && pointN < factors4n.length) {
//            if (factors4m[pointM] == factors4n[pointN]) {
//                answer *= factors4m[pointM];
//                pointM++;
//                pointN++;
//            } else if (factors4m[pointM] < factors4n[pointN]) {
//                pointM++;
//            } else {
//                pointN++;
//            }
//        }
//        return answer;
//    }
//
//    public static void factors(int m, int[] factors) {
//        int i = 0;
//        int factor = 2;
//        while (factor <= m) {
//            while (m % factor == 0) {
//                m /= factor;
//                factors[i] = factor;
//                i++;
//            }
//            factor++;
//        }
//        if (i < factors.length) {
//            factors[i] = -1;
//        }
//    }
//
//    public static void prime(int n, int[] l) {
//        int[] A = new int[n + 1];
//        A[0] = 0;
//        A[1] = 0;
//        for (int p = 2; p < A.length; p++) {
//            A[p] = p;
//        }
//        for (int p = 2; p < Math.sqrt(n); p++) { //get primes
//            int j = p * p;
//            while (j <= n) {
//                A[j] = 0;
//                j += p;
//            }
//        }
//        for (int p = 2, i = 0; p <= n; p++) {
//            if (A[p] != 0) {
//                l[i] = A[p];
//                i++;
//            }
//        }
//    }
//    public static int Euclid(int m,int n){
//        int min=Math.min(m,n);
//        int max=Math.max(m,n);
//        int temp=0;
//        while(min!=0){
//            System.out.println(max+" "+min);
//            temp=max%min;
//            max=min;
//            min=temp;
//            System.out.println(max+" "+min);
//
//        }
//        return max;
//    }
//    public static int recursiveEuclid(int m,int n){
//        if(n==0){
//            return m;
//        }else{
//            m=Math.max(m,n);
//            n=Math.min(m,n);
//        }
//        return (recursiveEuclid(n,m%n));
//    }

    //trying
    public static void main(String [] args){
//        System.out.println(GCD(6,10));
        System.out.println(RecursiveGCD(5,15));
    }
    public static int GCD(int x,int y){
        int temp=1;
        if(x>y){
            for(int i=2;i<=y;i++){
                if(x%i==0 && y%i==0){
                    temp=i;
                }

            }
        }else if (x<y){
            for(int i=2;i<=x;i++){
                if(x%i==0 && y%i==0){
                    temp=i;
                }

            }
        }
        return temp;
    }
    public static int RecursiveGCD(int x, int y){
//        int r=Math.min(x,y);
//        if(r==0){
//            return Math.max(x,y);
//        }else{
//            return RecursiveGCD(Math.max(x,y),Math.max(x,y)%r);
//        }
        if(Math.max(x,y)%Math.min(x,y)==0){
            return Math.min(x,y);
        }
            return RecursiveGCD(Math.max(x,y),Math.max(x,y)%Math.min(x,y));

    }
}
