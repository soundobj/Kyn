package com.me.kyn.learning;

import java.util.List;

public class LessonBase {
	
	/**
	 * whether the user has completed this Lesson
	 */
	private boolean isCompleted;
	/**
	 * 
	 */
	private String content;
	/**
	 *  used to gather specific lesson properties
	 */
	private String ID;
	/**
	 * 
	 */
	OutputManager outputManager;
	
	public String getBrief() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean isPassed() {
		// TODO Auto-generated method stub
		return false;
	}

	public List<UserTask> getTerminatedTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getID() {
		return ID;
	}

	public OutputManager getOutputManager() {
		return outputManager;
	}

	public void setOutputManager(OutputManager outputManager) {
		this.outputManager = outputManager;
	}
}
