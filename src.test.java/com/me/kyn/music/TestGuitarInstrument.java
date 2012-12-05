package com.me.kyn.music;

import java.util.List;

import junit.framework.TestCase;
import org.junit.Test;

import com.me.kyn.instrument.ClassicalGuitar;
import com.me.kyn.instrument.MusicString;

public class TestGuitarInstrument extends TestCase {
	
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
		 */
		List<MusicString> strings = guitar.getStrings(); 
		assertEquals("G2", strings.get(5).playFret(3));
		assertEquals("D3", strings.get(4).playFret(5));		
		/*
		 * and we can find out what note a fret plays in a specific musicString
		 */
		assertEquals(8, strings.get(5).findNote("C3"));
		assertEquals(4, strings.get(2).findNote("B3"));
		assertEquals(-1, strings.get(5).findNote("C#7"));
		/*
		 * and we can check the number of frets a string has
		 */
		assertEquals(19, strings.get(0).getNotes().size());
	}

}
