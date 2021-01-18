package RecursionPrograms;

public class PrintAsciiNumbers {
    static char i='z';
	public static void main(String[] args) {
		PrintAsciiNumbers asci=new PrintAsciiNumbers();
		asci.acinum(i);
		
	}

	private void acinum(char i) {
		int asciiNumber=(int)i;
		System.out.println(asciiNumber);
	}

}
