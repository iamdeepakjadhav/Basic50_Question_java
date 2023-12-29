public class ArmstrongNumber{
	public static void main(String[] args){
		int anum =  153, t1, t2, leng=0 , rem, arm = 0;
		
		t1 = anum;
		while(t1 != 0){
			t1 = t1 / 10;
			leng = leng+1;
		}
		t2 = anum;
		
		while(t2 != 0){
			rem = t2 % 10;
			int mult = 1 ;
			for(int i = 0; i<= leng ; i++){
				mult = mult * rem;
			}
			arm = arm +mult;
			t2 = t2/ 10;			
		}
		
		if(anum == arm){
			System.out.print(anum +" is Armstrong number");
		}else{
			System.out.print(anum + " is not armstrong");
		}
		
	}
}