package com.me.kyn.learning;

import java.util.List;

public interface UserTask {
	public List<Score> getScores();
	public void start();
	public boolean terminate();
}
