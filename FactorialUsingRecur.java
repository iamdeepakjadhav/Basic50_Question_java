public class FactorialUsingRecur {
    static int fact =1;
    public static void main(String[] args) {
        int num = 5;
        new FactorialUsingRecur().countFact(num);
        System.out.println("factorial is "+fact);
    }

    
    void countFact(int num){
        if(num>=1){
            fact = fact*num;
            countFact(num-1);
        }
    }
}
