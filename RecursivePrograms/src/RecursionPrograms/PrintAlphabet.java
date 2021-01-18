package RecursionPrograms;

public class PrintAlphabet {
 static char i='H';
	public static void main(String[] args) {
		PrintAlphabet alpha=new PrintAlphabet();
		alpha.display(i);
	}

	private char display(char i) {
	if(i>='A' && i<='Z' || i>='a' && i<='z') {
		System.out.println(i + " its an aplhabet ");
	}else {
		System.out.println(i + " its not an alphabet");
	}
	return i;
	}

}
