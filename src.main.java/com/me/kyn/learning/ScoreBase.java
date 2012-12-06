package com.me.kyn.learning;

import java.util.Date;

public abstract class ScoreBase {
	/**
	 * the time in seconds that took to score
	 */
	private int time;
	/**
	 * the amount of mistakes the user made in this score
	 */
	private int mistakes;
	/**
	 * the date the score was achieved
	 */
	private Date date;
	
	public ScoreBase(){}
	
	public ScoreBase(int time, int mistakes, Date date) {
		super();
		this.time = time;
		this.mistakes = mistakes;
		this.date = date;
	}
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getMistakes() {
		return mistakes;
	}
	public void setMistakes(int mistakes) {
		this.mistakes = mistakes;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	/**
	 * 
	 * @param number unix timestamp
	 */
	public void setDate(long number) {
		/*
		 * multiply by a thousand to create a Date object
		 */
		this.date = new java.util.Date(number * 1000);
	}	

}