/**
 * 
 */
package com.github.reedcourty.eafi.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.github.reedcourty.eafi.graphgenerator.GraphGenerator;

/**
 * @author reedcourty
 *
 */
public class GraphGeneratorTester {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void call_GraphGenerator_generate_method() {
		GraphGenerator graphGenerator = new GraphGenerator();
		graphGenerator.generate();
	}

}
