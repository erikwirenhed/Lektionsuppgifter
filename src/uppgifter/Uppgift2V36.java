package uppgifter;

public class Uppgift2V36 {

	public static String omv�ndaOrd(String ord){
		
		
		
		String[]stringArr = ord.split(" ");
		
		String[]tillf�llig = new String[3];
		
		
		tillf�llig[2] = stringArr[0];
		tillf�llig[0] = stringArr[2];
		
		stringArr[0] = tillf�llig[0];
		stringArr[2] = tillf�llig[2];
		
		
		
		String O = "";
		for (int i = 0; i < tillf�llig.length; i++) {
			O += stringArr[i];
			O += " ";
		}
		return O;
	}
	
	public static void main(String[] args) {
		System.out.println(omv�ndaOrd("erik simon tobias"));
	}
}
