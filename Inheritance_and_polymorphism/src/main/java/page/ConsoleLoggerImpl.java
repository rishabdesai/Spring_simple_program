package page;

public class ConsoleLoggerImpl implements Logger {
	@Override
	public void log(String message) {
		System.out.println("Console output using ConsuleLoggerImpl.java  : " + message);
	}
}
