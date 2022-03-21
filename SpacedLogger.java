package week5Assignment;

public class SpacedLogger implements Logger {
	@Override
	public void log(String log) {
		String word = log;
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < word.length() - 1; i++) {
			str.append(word.charAt(i));
			str.append(" ");
		}
		str.append(word.charAt(word.length() - 1));
		System.out.println(str);
	}
	@Override
	public void error(String error) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < error.length() - 1; i++) {
			str.append(error.charAt(i));
			str.append(" ");
		}
		str.append(error.charAt(error.length() - 1));
		System.out.println("ERROR: " + str);
		
	}

}
