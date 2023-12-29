public class OneTwo100Prime{
	
	public static void main(String[] args){
		boolean bul = true;
		int tamp = 1;
		
		for(int i = 1; i <= 100; i++){
			
			for(int j = 2; j<i || i == 1 || i==2 ; j++){
				if(i % j == 0){
					bul = false;
					
					if(i == 2){
						bul = true;
						tamp = i;
					}
					break;
				}else{
					
					tamp = i;
					bul = true;
					if (i==1) {
						break;
					}
					
				}
				
			}
			if(bul){
				System.out.print(tamp + " ");
			}
		}
	}
}