package com.soundbrake.helloworld.test;

import junit.framework.TestCase;

/**
 * 
 * @author:Mary Jiang
 * @Date:Oct 28, 2016
 * @Email: mesuper222@gmail.com
 *
 */

public class MyTester extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	
	public void testMyTheory(){
		try{
			assertTrue(true);
		}catch(Exception e){
			fail(e.getMessage());
		}
	}

}
