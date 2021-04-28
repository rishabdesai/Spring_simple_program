package page;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class FileLoggerImpl implements Logger {
	private String filePath;
	
	public FileLoggerImpl() {
		this.filePath = "application.log";
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public void log(String message) {
		System.out.println("File: " + message);
		File logFile = new File(filePath);
		try(FileOutputStream fout = new FileOutputStream(logFile, true)) {
			try(PrintStream out = new PrintStream(fout)) {
				out.println(message);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}


