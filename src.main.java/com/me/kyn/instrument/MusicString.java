package com.me.kyn.instrument;

import java.util.List;

import com.me.kyn.music.Note;

public class MusicString {	
	/**
	 *  The notes that can be played in this MusicString
	 */
	private List<Note> notes; 	
	/**
	 * @param notes
	 */
	public MusicString(List<Note> notes) {
		super();
		this.notes = notes;
	}
	
	public List<Note> getNotes() {
		return notes;
	}
	
	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	
	public String playNote(int fret){
		try {
			return notes.get(fret).getName();
		} catch (Exception e) {
			System.out.println(String.format("Could not find fret in String: frets:%d requested:%d message:%s",notes.size(), fret, e.getMessage()));
		}
		return null;
	}
}
