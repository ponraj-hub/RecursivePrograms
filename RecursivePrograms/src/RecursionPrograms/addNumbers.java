package RecursionPrograms;

public class addNumbers {
     
    int total=0;
	public static void main(String[] args) {
		int i=3;
		addNumbers ad=new addNumbers();
		System.out.println(ad.add(i));
	}
	private int add(int i) {
	if(i>=1) {
		total=total+i;
		i--;
		add(i);
	}
	return total;
	}
}
