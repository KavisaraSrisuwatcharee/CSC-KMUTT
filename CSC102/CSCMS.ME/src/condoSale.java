import java.util.Scanner;
import java.util.Arrays;
public class condoSale {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int nRoom=sc.nextInt();
        int fRoom=sc.nextInt();
        int order=sc.nextInt();
        int mRoom [] =new int [order];
        int maxRoom=fRoom+nRoom-1;
        int count=0;
        int temp[] =new int [order+2];
        for(int i=0;i<order;i++){
            mRoom[i]=sc.nextInt();
        }
        Arrays.sort(mRoom);
        for(int i=0;i<order;i++){
            if(mRoom[i]>=fRoom && mRoom[i]<=maxRoom){
                temp[i]+=mRoom[i];
//                System.out.print(temp[i]+" ");
            }
        }

        for(int i=0;i<order;i++){
               if(temp[i]==temp[i+1]){
                   temp[i]=0;
               }else{

               }
        }
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++){
            if(temp[i]!=0){
                count++;

            }
        }
        System.out.println(count);
        for(int i=0;i<temp.length;i++){
            if(temp[i]!=0){
                System.out.println(temp[i]);
            }
        }

    }
}
