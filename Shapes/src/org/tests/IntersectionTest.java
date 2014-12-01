package org.tests;

import static org.junit.Assert.*;

import org.classes.Elipse;
import org.classes.Intersection;
import org.classes.Rectangle;
import org.junit.Test;

public class IntersectionTest {
	private Rectangle rec;
	private Elipse el;
	private Intersection inter;
	
	public IntersectionTest() {
		rec = new Rectangle(10, 20);
		el = new Elipse(10, 5);
		inter = new Intersection(rec, el);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
