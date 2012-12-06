package com.me.kyn.learning;

import java.util.List;

public interface Lesson {
	
	public String getBrief();
	public boolean createTasks();
	public boolean isPassed();
	public List<UserTask> getTerminatedTasks();

}
