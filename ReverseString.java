public class ReverseString {
    public static void main(String[] args) {
        String name = "Deepak";
        int leng = name.length()-1;
        String revstr = "";
        while (leng >=0) {
            revstr = revstr + name.charAt(leng);
            leng--;
        }
        System.out.println(revstr);
    }
}
