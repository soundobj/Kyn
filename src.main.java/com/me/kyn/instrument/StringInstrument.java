package com.me.kyn.instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.me.kyn.music.NoteGenerator;

public abstract class GuitarInstrument {

	private NoteGenerator noteGenerator = new NoteGenerator();
	/**
	 *  the number of strings in the instrument
	 */
	List<MusicString> strings = new ArrayList<MusicString>();
	
	public GuitarInstrument() {
		super();
		noteGenerator.setNotes();		
	}	
	/**
	 * 
	 * @param musicStrings Map<Integer,String> musicStrings stores as a key the String no i.e. 6 
	 * and the open string note E3
	 */
	public void tuneStrings(Map<Integer,String> musicStrings, int noOfFrets){
		for( Integer key : musicStrings.keySet() ){
	    	/*
	    	 * get all existing notes and slice from the open note provided in the musicStrings Map to the number of frets this guitar has
	    	 */
	    	int openStringIndex = noteGenerator.getNoteIndex(musicStrings.get(key));
	    	strings.add( new MusicString( noteGenerator.getNotes().subList( openStringIndex,  (openStringIndex + noOfFrets))));	    	
	    }
	}
	public List<MusicString> getStrings() {
		return strings;
	}
}