package utils;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Properties;

import org.checkerframework.common.value.qual.StaticallyExecutable;

public class Configuration {
	private Properties properties;

	public String getProperty(String key) {
		return properties.getProperty(key);
	}

	public Configuration() {
		loadProperty();
	}

	public void loadProperty() {
		properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.loadProperty();
		System.err.print(configuration.getProperty("url"));
	}
}
