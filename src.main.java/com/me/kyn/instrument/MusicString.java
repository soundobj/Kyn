package com.me.kyn.instrument;

import java.util.List;

import com.me.kyn.music.Note;
import com.me.kyn.music.NoteGenerator;

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
	
	public String playFret(int fret){
		try {
			return notes.get(fret).getName();
		} catch (Exception e) {
			System.out.println(String.format("Could not find fret in String: frets:%d requested:%d message:%s",notes.size(), fret, e.getMessage()));
		}
		return null;
	}	
	/**
	 * proxy method for NoteGenerator.getNoteIndex 
	 * @param noteName 
	 * @return the fret index where the note reside, returns -1 if it cannot find the note in the string
	 */
	public int findNote(String noteName){
		return NoteGenerator.getNoteIndex(noteName, this.notes);
	}
}