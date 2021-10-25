package com.cpds.jenkinsMaven;

import com.cpds.training.Jenkins.*;

import static org.junit.Assert.*;

//import org.junit.Test;
import org.testng.annotations.Test;

public class JenkinsCalcTest {

	@Test
	public void testAdd() {
		JenkinsCalc calc= new JenkinsCalc();
		assertEquals(10,calc.addNb(3,7));
//		fail("Not yet implemented");
	}
	@Test
	public void testSub() {
		JenkinsCalc calc= new JenkinsCalc();
		assertEquals(-4,calc.subNb(3,7));
//		fail("Not yet implemented");
	}

}
