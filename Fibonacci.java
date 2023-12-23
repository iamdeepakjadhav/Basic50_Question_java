import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of fibonacci series : ");
        int n = sc.nextInt();
        int a = 0, b = 1, tamp;
        // System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            tamp = a + b;
            a = b;
            b = tamp;
        }
    }
}