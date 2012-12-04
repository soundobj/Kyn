package com.me.kyn.music;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.xeustechnologies.esl4j.LogManager;
import org.xeustechnologies.esl4j.impl.JdkLogFactory;

import com.me.kyn.settings.JsonAdaptor;

public class TestJsonAdaptor extends TestCase {
	
	JsonAdaptor settingsManager;
	JSONObject noteFrequencySettings;
	
    public void setUp() throws FileNotFoundException, IOException, ParseException  {
    	LogManager.setFactory(new JdkLogFactory());
    	settingsManager = new JsonAdaptor("src.test.resources/test-musical-frequencies.json");
    	this.noteFrequencySettings = settingsManager.getJson();
    }
    
    @Test
    public void testWhenSystemStartsUpItLoadsTheNotesConfigurations(){
    	List<Note> notes = new ArrayList<Note>();
    	
		// loop array
		JSONArray jsonNotes = (JSONArray) noteFrequencySettings.get("notes");
		Iterator<Map<String,Object>> iterator = jsonNotes.iterator();
		while (iterator.hasNext()) {
			notes.add(new Note(iterator.next()));
		}
		
		/*
		 *  given that a json with 2 note objects has been provided
		 *  when we map the json objects to Note objects
		 *  then we should have two note objects
		 */
		assertEquals(2, notes.size());
		
		/*
		 * given that the json file has a sequence structure
		 * when we map and add the note objects to the list
		 * then the list will retain the same order
		 */
		assertEquals(65.406, notes.get(0).getFrequency());
		
		
           
    }
    
    public void tearDown(){    	
    	this.settingsManager = null;
    	this.noteFrequencySettings = null;    	
    }
}
