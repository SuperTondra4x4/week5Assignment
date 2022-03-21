package week5Assignment;

public class App {
	public static void main(String[] args) {
		Logger testALogger = new AsterixLogger();
		Logger testSLogger = new SpacedLogger();
		testALogger.log("Hello All.");
		testALogger.error("Hello All - Error tester1.");
		testSLogger.log("Hello All.");
		testSLogger.error("Hello All - Error tester2.");
	}
}
