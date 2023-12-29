public class PalindromNum{
	public static void main(String[] args){
		int pnum = 121, rem , rev = 0;
		int tamp = pnum;
		while(tamp != 0){
			rem = tamp %10;
			rev = (10 * rev) + rem;
			tamp = tamp / 10;			
		}
		
		if(pnum == rev){
			System.out.println("number is plaindrom number");
		}else{
			System.out.println("not a plaindrom");
		}
	}
}