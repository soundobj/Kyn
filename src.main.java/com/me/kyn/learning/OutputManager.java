package com.me.kyn.learning;

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
	private Properties props; 
}
