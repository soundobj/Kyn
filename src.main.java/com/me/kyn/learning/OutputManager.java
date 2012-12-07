package com.me.kyn.learning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

/**
 * @author dedied01
 * this class manages user Output in different languages
 * depending on a given locale.
 * 
 * each supported language has a folder named by its locale id i.e. en for English
 * in the src.main.resources folder
 * in the folder there is a messages.properties that is handled with a Properties Object
 * 
 */
public class OutputManager {

	private Locale locale;
	private Properties properties = new Properties();
	private String language;
	
	public OutputManager(String language) {
		this.locale = new Locale(language);
		this.language = language;
	}
	public Locale getLocale() {
		return locale;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	public Properties getProperties() {
		return properties;
	}
	private void setProperties() throws FileNotFoundException, IOException  {
		try {
			properties.load(new FileInputStream("src.main.resources/" + this.language + "/messages.properties"));
		} catch (FileNotFoundException e) {
			System.out.println(String.format("Could not load language properties for %s due to error %s defaulting to English", locale.getCountry(),e.getMessage()));
			e.printStackTrace();
		}
		try {
			properties.load(new FileInputStream("src.main.resources/en/messages.properties"));
		} catch (Exception e) {
			throw new FileNotFoundException();
		}
	} 
	
	public String getMessage(String messageId){
		return null;
	}
}
