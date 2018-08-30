package uppgifter;

public class Uppgift2 {
	
	public static String baklänges(String ord){
		
		 char[] a =ord.toCharArray() ;
		
		 char[]b = ord.toCharArray();
		 
		System.out.println(a);
		
		for (int i = a.length; i > a.length; i--) {
			int j = 0;
			char c = a[i];
			b[j] = c;
			j++;
		}
		String g=b.toString();
		return g;
		
	}
	
	public static void main(String[] args) {
		System.out.println(baklänges("Erik."));
	}
}
