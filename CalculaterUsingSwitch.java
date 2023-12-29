import java.util.Scanner;

public class CalculaterUsingSwitch {
    static String y;
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number : ");
            int num2 = sc.nextInt();

            System.out.print("Enter + , - , x , / , %  : ");
            
            char symbol = sc.next().charAt(0);
            switch (symbol) {
            case '-': {
                System.out.printf("%d - %d = %d ", num1, num2, (num1 - num2));
                break;
            }
            case '+': {
                System.out.printf("%d + %d = %d ", num1, num2, (num1 + num2));
                break;
            }
            case '/': {
                System.out.printf("%d / %d = %d ", num1, num2, (num1 / num2));
                break;
            }
            case '*': {
                System.out.printf("%d * %d = %d ", num1, num2, (num1 * num2));
                break;
            }
            case '%': {
                System.out.printf("%d % %d = %d ", num1, num2, (num1 % num2));
                break;
            }
            default: {
                System.out.println("invalid sysmbol !");
                break;
            }

        }
        System.out.println("do you want to continue (press y for yas or n for no) : ");
        y = sc.next();
        } while (y.equals("y")|| y.equals("Y"));
    }
}