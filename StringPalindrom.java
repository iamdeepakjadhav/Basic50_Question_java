import java.util.Scanner;

public class StringPalindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        boolean bul = true;
        int l = name.length()-1;
        
        for(int i = 0; i<name.length();i++){
            if (name.charAt(i)==name.charAt(l)) {
                bul = true;
            }else{
                System.out.println(name+" is not a palindrom");
                bul = false;
                break;
            }
            l--;
        }
        if (bul) {
            System.out.println(name+" is palindrom");
        }
    }
}
