package com.me.kyn.settings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.xeustechnologies.esl4j.LogManager;
import org.xeustechnologies.esl4j.Logger;

public class JsonAdaptor {

	private JSONParser parser = new JSONParser();
	private JSONObject json;
	private String file;
	private Logger logger = LogManager.getLogger(JsonAdaptor.class);
	
	public JsonAdaptor(String file) {
		super();
		this.file = file;
		try {
			loadJson();
		} catch (Exception e) {
			logger.error(String.format("Could not load file: %s due to error: %s", this.file,e.getMessage()));
			e.printStackTrace();
		}
	}

	// load json
	public void loadJson() throws FileNotFoundException, IOException, ParseException {
		// get the json file and parse it
		Object obj  = parser.parse(new FileReader(this.file));
		this.json = (JSONObject) obj;
	}

	public JSONObject getJson() {
		return json;
	}

	public void setJson(JSONObject json) {
		this.json = json;
	}
	
	public String printFileContents() {
		String file ="";
		try {
			FileReader fr = new FileReader(this.file);
			BufferedReader br = new BufferedReader(fr);                                                   
			//Read br and store a line in 'file'
			String data;    
	        while((data = br.readLine()) != null) {   
	            file += data + "\n";  
	        }  
		} catch (Exception e) {
			logger.error("Could not printFileContents due to error:" + e.getMessage());
		}
        return file;
	}	
	//TODO: edit save json
}
