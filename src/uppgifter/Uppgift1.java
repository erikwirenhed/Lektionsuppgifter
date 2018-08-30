package uppgifter;

public class Uppgift1 {
	
	public static int summa(int... m ){
		int n = 0;
		
		for (int i : m) {
			n+=i;
			
		}
		return n;
		
		
		
	}
	
public static void main(String[] args) {
	
	
	System.out.println(summa(5,6,8,9,1,3,4));
}
	
}
