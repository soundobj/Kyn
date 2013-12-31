package com.me.kyn.learning;

import junit.framework.TestCase;

public class TestOutputManager extends TestCase  {

	OutputManager outputManager0;
	OutputManager outputManager1;
	@Override
	protected void setUp() throws Exception {
		outputManager0 = new OutputManager("en");
		outputManager1 = new OutputManager("es");
	}
	
//	public void test

	@Override
	protected void tearDown() throws Exception {
		outputManager0 = null;
		outputManager1 = null;
	}

}
