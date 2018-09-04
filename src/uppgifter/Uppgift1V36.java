package uppgifter;

public class Uppgift1V36 {
	public static int summa(int[] b){
		int j = 0;
		for (int i = 0; i < b.length; i++) {
			 j += b[i];
			
		}
		
		return j;
	}
	
	public static void main(String[] args) {
		int[] j = new int[(int)(Math.random()*100)];
		for (int i = 0; i < j.length; i++) {
			j[i] = (int)(Math.random() * 10);
		
		}
		
		System.out.println(summa(j));
	}
}
