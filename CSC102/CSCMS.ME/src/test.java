import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("a");
        name.add("b");
        name.add("c");
        for(int i=0;i<=name.size();i++){
            System.out.println(name.get(i));
        }

    }
}
