package manager;

import filereader.ConfigFileReader;

public class FileReaderManager {
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstant() {
		return fileReaderManager;
	}
	
	public ConfigFileReader getConfigReader() {
		//If else in shorthand
		return (configFileReader == null) ? configFileReader = new ConfigFileReader() : configFileReader;
	}
}
