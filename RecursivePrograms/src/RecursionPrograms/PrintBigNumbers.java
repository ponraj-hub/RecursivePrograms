package RecursionPrograms;


public class PrintBigNumbers {
    static int x=0;
    static int num[]= {-105,0,10,20};
    
	public static void main(String[] args) {
		PrintBigNumbers big=new PrintBigNumbers();
		big.getBig(x);
		
	}

	private void getBig(int x) {
		for(int i=0;i<num.length;i++) {
			if(x<num[i]) {
				x=num[i];	
			}		
		}
		System.out.println( "biggest num is " +x);
	}

}
