/**
 * 
 */
package com.github.reedcourty.eafi.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import virtualization.Infrastructure;
import virtualization.Machine;
import virtualization.VirtualizationFactory;

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
		
		VirtualizationFactory.eINSTANCE.eClass();
		
		VirtualizationFactory factory;
		
		factory = VirtualizationFactory.eINSTANCE;
		
		Infrastructure infrastructure;
		
		infrastructure = factory.createInfrastructure();
		
		Machine luthien = factory.createMachine();
		luthien.setIsVirtualized(false);
		luthien.setName("luthien");
		
		infrastructure.getMember().add(luthien);
		
		GraphGenerator graphGenerator = new GraphGenerator(infrastructure);
		graphGenerator.generate();
	}

}
