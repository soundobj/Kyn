package com.me.kyn.music;

import java.util.ArrayList;
import java.util.List;

public class NoteGenerator {
	/**
	 * An equal temperament is a musical temperament, or a system of tuning, in which every pair of adjacent notes has an identical frequency ratio.
	 * in our case is TWELFTH_ROOT_OF_TWO
	 */
	private static final double TWELFTH_ROOT_OF_TWO = 1.05946309436;
	/**
	 * the chromatic scale frequency to note mapping, we start on G# because is the 0 note using the TWELFTH_ROOT_OF_TWO algorythm
	 */
	private static final String[] CHROMATIC_SCALE = new String[]{"G#","A","A#","B","C","C#","D","D#","E","F","F#","G"};
	
	private List<Note> notes; 
	
	public NoteGenerator(){}
	
	public List<Note> getNotes() {
		if (notes != null && notes.size() > 0){
			return notes;
		} else {
			this.setNotes();
			return notes;
		}
	}
	public void setNotes() {		
		List<Note> notes = new ArrayList<Note>();
		int octavesCompleted = 0;
		int currentOctave = 0;
		for (int i = 1; i <= 88; i++) {
			Note note = new Note();
			/**
			 *  with the 49th key, the fifth A (called A4), tuned to 440 Hz (referred to as A440). 
			 *  Each successive pitch is derived by multiplying (ascending) or dividing (descending) 
			 *  the previous by the twelfth root of two (approximately 1.05946...). 
			 *  For example, to get the frequency a semitone up from A4 (A♯4), multiply 440 by the 
			 *  twelfth root of two. To go from A4 to B4 (up a whole tone, or two semitones), multiply 440 twice by the twelfth root of two.
			 */
			note.setFrequency( Math.pow(TWELFTH_ROOT_OF_TWO, i - 49) * 440  );	
			/*
			 *  if we can divide the current number by 12 then we have gone up one scale, make a note in octavesCompleted so we can map the correct note name
			 *  i.e is the current note is 15 then we subtrac 12 that points to  CHROMATIC_SCALE[3] thus 'B'
			 */		
			if (i%12 == 0 ){
				octavesCompleted += 12;
			}			
			String noteName = CHROMATIC_SCALE[i - octavesCompleted];
			// New octaves Start in C
			if ( noteName == "C" ){
				currentOctave++;
			}
			note.setName(noteName + currentOctave );
			note.setOctave(currentOctave);
			notes.add(note);	
		}		
		this.notes = notes;
	}	
	/**
	 * 
	 * @param noteName the name of the note i.e C#4
	 * @return the index of this note in the notes list
	 */
	public int getNoteIndex(String noteName){
		for(Note note:notes){
			if(note.getName().equals(noteName)){
				return notes.indexOf(note);
			}
		}
		return -1;
	}
}