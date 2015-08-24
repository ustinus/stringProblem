package stringProblem;

public class StringMethod {
	public static String loopMethod(String word, char i) {
		StringBuffer newWord = new StringBuffer();
		for(int k = 0; k < word.length(); k++) {
			if(word.charAt(k) != i) {
				newWord.append(word.charAt(k));
			} else {continue;}
		}
		return newWord.toString();
	}
	
	public static String stringFunction(String word, char i) {
		String newString = word.replaceAll(i+"", "");
		return newString;
	}
}
