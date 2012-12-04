package com.me.kyn.music;

import java.util.List;
import junit.framework.TestCase;
import org.junit.Test;

public class TestNoteGenerator extends TestCase {
	NoteGenerator noteGenerator;
	List<Note> notes;	
	@Test
	public void testgetNotes () {
		/*
		 *  given that the note generator has been instantiated
		 *  when we request the getNotes() method
		 *  then we should receive a list of Notes starting with A0 and ending on C8
		 */
		notes = noteGenerator.getNotes();
		assertEquals(27.49999999912186, notes.get(0).getFrequency());
		assertEquals(4186.009044918184, notes.get(87).getFrequency());
		assertEquals(88, notes.size());
	}
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		noteGenerator = new NoteGenerator();
	}
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		noteGenerator = null;		
	}	
	@Test
	public void testGetNoteIndex(){
		notes = noteGenerator.getNotes();
		/*
		 * given that the list of Notes have been instantiated
		 * when the client pass a valid note name to getNoteIndex()
		 * then the note's index in the notes list will be returned
		 */
		assertEquals(0, noteGenerator.getNoteIndex("A0"));
		assertEquals(12, noteGenerator.getNoteIndex("A1"));
	}
}