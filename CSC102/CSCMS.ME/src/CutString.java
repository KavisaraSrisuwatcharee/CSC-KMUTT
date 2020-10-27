import java.util.Scanner;

public class CutString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().toLowerCase();
        int count=1;
        for(int i=1;i<name.length();i++){
            if((name.substring(i,i+1).contains(name.substring(0,i)))){
                count+=1;
                System.out.println(count);
            }else{
                i++;
            }
        }
        System.out.print(count);
    }
}