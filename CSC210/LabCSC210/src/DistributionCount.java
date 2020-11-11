import java.util.Scanner;
public class DistributionCount {
    public static void main(String[] args) {
        int [] number={13,11,12,13,12,12};
        distriCount(number);
    }
    public static int Max(int [] number){
        int max=number[1];
        for(int i=0;i<number.length;i++){
           if(max<number[i]){
               max=number[i];
           }
        }
        return max;
    }
    public static void distriCount(int [] number){
        int maxNum= Max(number);
        int freq[]=new int [maxNum+1];
        for(int i=0;i<number.length;i++){
            freq[number[i]]++;
        }
        int result[] =new int [number.length];
        for(int i=1;i<freq.length;i++){
            freq[i]=freq[i-1]+freq[i];
        }
        for(int i=number.length-1;i>=0;i--){
            result[freq[number[i]]-1]=number[i];
            freq[number[i]]--;
        }
        for(int i=0;i<number.length;i++){
            System.out.print(result[i]+" ");
        }
    }

}
