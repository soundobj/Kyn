package com.me.kyn.music;

import java.util.List;

import junit.framework.TestCase;
import org.junit.Test;

import com.me.kyn.instrument.ClassicalGuitar;
import com.me.kyn.instrument.MusicString;

public class TestInstrument extends TestCase {
	
	ClassicalGuitar guitar;

	@Override
	protected void setUp() throws Exception {
		guitar = new ClassicalGuitar();
		guitar.init();
	}

	@Override
	protected void tearDown() throws Exception {
		guitar = null;
	}

	@Test
	public void testInit() {
		/*
		 * given that a Classical guitar has been initialized
		 * and a list of Notes have been given to the guitar
		 * when we get a string from the guitar
		 * then we can play a note by requesting a fret
		 * and we can check the number of frets a string has
		 */
		List<MusicString> strings = guitar.getStrings(); 
		assertEquals("G", strings.get(6).playNote(3));
		assertEquals("D", strings.get(5).playNote(5));
		assertEquals(19, strings.get(0).getNotes().size());
	}

}
