package RecursionPrograms;

public class PrintAscendingNum {

	public static void main(String[] args) {
		
		PrintAscendingNum rec=new PrintAscendingNum();
	    rec.display(1);

	}

	private void display(int no) {
		if(no<=5) {
			System.out.println(no);
			no++;
			display(no);		
		}	
	}
}
