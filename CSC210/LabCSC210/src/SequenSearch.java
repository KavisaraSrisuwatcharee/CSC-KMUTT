public class SequenSearch {
    public static void main(String[] args){
        System.out.print(SequenceSearch("abcdefg","cde"));

    }
    public static boolean SequenceSearch(String a,String b) {
        int temp = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    temp += 1;
                    System.out.println(temp);
                }else{
                    break;
                }
            }
        }
        if (temp == b.length()) {
            return true;
        }
        return false;
    }

}
