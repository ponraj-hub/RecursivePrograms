package RecursionPrograms;

public class PrintFactorial {
     int total=1;
	public static void main(String[] args) {
		
		PrintFactorial rd=new PrintFactorial();
		System.out.println(rd.fact(5));
	}

	private int fact(int i) {
		if(i==1) {
			return 1;
		}else {
			return i*fact(i-1);
		}
		
	}

}
