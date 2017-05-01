package com.justin.maps;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SchoolClassTest {
	private SchoolClass schoolClass;
	@Before
	public void init(){
		schoolClass = new SchoolClass();
		
	}
	@Test
	public void canReportEatables(){
		schoolClass.reportEatables();
	}
	@Test
	public void canReportLaptopUse(){
		schoolClass.reportLaptopUse();
	}
}
