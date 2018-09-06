package uppgifter;

public class Uppgift2V36 {

	public static String omvändaOrd(String ord){
		
		
		
		String[]stringArr = ord.split(" ");
		
		String[]tillfällig = new String[3];
		
		
		tillfällig[2] = stringArr[0];
		tillfällig[0] = stringArr[2];
		
		stringArr[0] = tillfällig[0];
		stringArr[2] = tillfällig[2];
		
		
		
		String O = "";
		for (int i = 0; i < tillfällig.length; i++) {
			O += stringArr[i];
			O += " ";
		}
		return O;
	}
	
	public static void main(String[] args) {
		System.out.println(omvändaOrd("erik simon tobias"));
	}
}
