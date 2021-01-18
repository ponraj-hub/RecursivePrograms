package RecursionPrograms;

public class PrintStringText {
	int i=3;
	public static void main(String[] args) {
		PrintStringText rd=new PrintStringText();
		rd.pr("Ponraj");

	}

	private void pr(String text) {
		if(i>=1) {
			System.out.println("name is "+text);
			i--;
			pr(text);
		}
		
	}


}
