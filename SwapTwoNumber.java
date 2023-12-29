public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 10 , b = 29 , tamp ;
        System.out.printf("a = %d , b = %d \n",a,b);
        
        // fist logic 
        tamp = a ;
        a = b;
        b = tamp;

        // // second logic
        // a = a+b;   // 10+20 = 30
        // b = a-b;    // 30 - 20 = 10 <- is b = a
        // a = a - b;  // b = a is 10 so 30 - 10 = 20 <- b value

        System.out.println("a = "+a +" b = "+b);
    }
}
