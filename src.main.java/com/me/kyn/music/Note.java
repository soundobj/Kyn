package com.me.kyn.music;

import java.util.Map;

public class Note {
	
	private double frequency;
	private String name;
	private int octave;
	
	public Note(double frequency, String name, int octave) {
		super();
		this.frequency = frequency;
		this.name = name;
		this.octave = octave;
	}

	public Note(Map<String,Object> note) {
		this.frequency = (double) note.get("frequency");
		this.name = (String) note.get("name");
		Number octave = (Number) note.get("octave");
		this.octave = octave.intValue();
	}

	public Note() {}

	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOctave() {
		return octave;
	}

	public void setOctave(int octave) {
		this.octave = octave;
	}

	@Override
	public String toString() {
		return String.format("note:%s octave:%s frequency:%s\n", this.getName(), this.getOctave(), this.getFrequency());
	}
	
	
	

}