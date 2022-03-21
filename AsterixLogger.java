package week5Assignment;

public class AsterixLogger implements Logger {

	@Override
	public void log(String log) {
		String word = log;
		System.out.println("***" + word + "***");
	}

	@Override
	public void error(String error) {
		String word = error;
		StringBuilder astString = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			astString.append("*");
		}
		astString.append("*************");
		System.out.println(astString);
		System.out.println("***Error: " + word + "***");	
		System.out.println(astString);
	}

}
