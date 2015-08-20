package stringProblem;

public class StringMethod {
	public static String loopMethod(String word, char i) {
		String newWord = "";
		for(int k = 0; k < word.length(); k++) {
			if(word.charAt(k) != i) {
				newWord += word.charAt(k);
			} else {continue;}
		}
		return newWord;
	}
	
	public static String stringFunction(String word, char i) {
		String newString = word.replaceAll(i+"", "");
		return newString;
	}
}
