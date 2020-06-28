package filereader;

import java.util.Properties;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConfigFileReader {
	private Properties properties;
	private final String congigurationFilePath = "config//Configuration.properties";
	
	public ConfigFileReader() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(congigurationFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
			}catch(IOException e){
				e.printStackTrace();
			}
		}catch(FileNotFoundException e) {
			throw new RuntimeException("Properties file not found at provided location: "+congigurationFilePath);
		}finally {
			try {
				if(reader != null) {
					reader.close();
				}
			}catch(IOException ignore){
					
				}
			}
	}

	public String getBrowser() {
		String browserName = properties.getProperty("browser");
		return browserName;
	}
	
	public String getUrl() {
		String url = properties.getProperty("url");
		return url;
	}
}
