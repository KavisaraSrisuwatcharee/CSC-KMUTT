import java.util.Scanner;
public class PeakFinding{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+2];
        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1]){
                cnt++;
            }
        }
        System.out.println(cnt);
        for(int i=1;i<=n;i++){
            if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}