import java.util.Scanner;
public class Airplane {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int seat[] =new int[row*2];
        int nLSeat=0;
        int nRSeat=0;
        int wLeft=0;
        int wRight=0;

        int left[]=new int[row];
        int right[]=new int[row];
        for(int i=0;i<row*2;i++){
            seat[i]=sc.nextInt();
        }
        for(int i=0;i<row*2;i++){
            if(wLeft==wRight){
                left[nLSeat]+=seat[i];
                wLeft+=seat[i];
                nLSeat++;
            }else if(wLeft>wRight){
                right[nRSeat]+=seat[i];
                wRight+=seat[i];
                nRSeat++;
            }else if(wRight>wLeft){
                left[nLSeat]+=seat[i];
                wLeft+=seat[i];
                nLSeat++;

            }
        }
        for(int i=0;i<row;i++){
            System.out.println(left[i]+" "+right[i]);
        }
    }
}
