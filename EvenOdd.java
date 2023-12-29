import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find even odd : ");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.print("number is Even");
        }else{
            System.out.println("number is Odd ");
        }
    }   
}