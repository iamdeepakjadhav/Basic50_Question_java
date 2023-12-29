public class FibonacciRecurtion{
	static int a = 0 , b = 1, tamp;
	public static void main(String[] args){
		int num = 10, i = 0;
		FibonacciRecurtion fchack = new FibonacciRecurtion();
		fchack.printFibo(num, i);
	}
	void printFibo(int num , int i){
		if(i< num){
			System.out.print(a+ " ");
			tamp = a + b;
			a = b;
			b = tamp;
			printFibo(num, i+1);
		}
	}
}