package org.tests;

import static org.junit.Assert.*;

import org.classes.Elipse;
import org.junit.Test;

public class EllipseTest {
	
	private Elipse el;
	
	public EllipseTest() {
		el = new Elipse(10, 10, 50, 50);
	}

	@Test
	public void test() {
		assertTrue(el.contains(20, 20));
		assertTrue(!el.contains(50, 10));
		assertTrue(!el.contains(51, 10));
	}

}
