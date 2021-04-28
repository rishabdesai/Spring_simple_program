package page;

import org.springframework.stereotype.Component;

@Component
public class ConsoleLoggerImpl implements Logger {
	@Override
	public void log(String message) {
		System.out.println("Console output using ConsuleLoggerImpl.java  : " + message);
	}
}
