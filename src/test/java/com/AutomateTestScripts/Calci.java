package com.AutomateTestScripts;

import org.testng.annotations.Test;

public class Calci {
	@Test
	public void lamdaExpression() {
		Calculator Calci=(a,b)->{System.out.println(a+b);};
		Calci.add(10,20);
		Calci.add(10, 10);
	}
	
	
}
