package com.me.kyn.instrument;

import java.util.HashMap;
import java.util.Map;


public class ClassicalGuitar extends GuitarInstrument implements Instrument {
	/**
	 *  how many notes each Musicstring has
	 */
	private static final int NUMBER_OF_FRETS = 19;
	
	public ClassicalGuitar() {};
	
	@Override
	public void init() {
		/*
		 * standard tuning for classical guitar
		 */
		Map<Integer,String> musicStrings = new HashMap<Integer,String>();
		musicStrings.put(6,"E2");
		musicStrings.put(5,"A2");
		musicStrings.put(4,"D3");
		musicStrings.put(3,"G3");
		musicStrings.put(2,"B3");
		musicStrings.put(1,"E3");
		
		super.tuneStrings(musicStrings, NUMBER_OF_FRETS);
	}

}