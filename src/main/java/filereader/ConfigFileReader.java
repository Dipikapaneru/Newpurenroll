package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;

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

	public DriverType getBrowser() {
		String browserName = properties.getProperty("browser");
		if(browserName == null || browserName.equalsIgnoreCase("chrome")) {
			return DriverType.CHROME;
		}else if(browserName.equalsIgnoreCase("firefox")) {
			return DriverType.FIREFOX;
		}else if(browserName.equalsIgnoreCase("ie") || browserName.equalsIgnoreCase("internetexplorer")) {
			return DriverType.INTERNETEXPLORER;
		}else {
			throw new RuntimeException("Browser not found based of Key value in Configuration.Properties file: "+browserName);
		}
	}
	
	public String getUrl() {
		String url = properties.getProperty("url");
		return url;
	}
	
	public String getEnvironment() {
		return properties.getProperty("environment");
		
	}
	
	public String getDriverPath() {
		return properties.getProperty("driverPath");
	}
}
