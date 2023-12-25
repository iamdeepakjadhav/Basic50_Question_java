public class PrimeNumber {
    public static void main(String[] args) {

        int num = 0, i = 2;
        boolean primeBul = true;

        while (i < num) {
            if (num % i == 0 || num == 0 || num == 1) {
                System.out.println(num + " is not a prime");
                primeBul = false;
                break;
            }
            i++;
        }
        if (primeBul) {
            System.out.println(num + " is a prime number");
        }
    }
}
