package tw.org.iii.java2.allan;


public class lotto {

	public static void main(String[] args) {
		int[] lotto =new int[6];
		
		for (int i=0;i<lotto.length;i++){
			int temp;
			boolean isReapet;
			
			do{
				temp =(int)(Math.random()*49+1);
				
				isReapet=false;
				for(int j=0;j<i;j++){
					if(temp==lotto[j]){
						isReapet = true;
						break;
					}
				}
				
			}while(isReapet);
			
			System.out.println(temp);
			lotto[i]=temp;
			
		}

	}

}
