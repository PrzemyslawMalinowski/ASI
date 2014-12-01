package org.tests;

import static org.junit.Assert.*;

import org.classes.Difference;
import org.classes.Elipse;
import org.classes.Intersection;
import org.classes.Rectangle;
import org.classes.Union;
import org.interfaces.Shape;
import org.junit.Test;

public class SetsTest {
	private Intersection inter;
	private Difference diff;
	private Union union;

	private Shape s1;
	private Shape s2;

	public SetsTest() {
		s1 = new Rectangle(10, 10);
		s2 = new Elipse(1, 2);

		inter = new Intersection(s1, s2);
		diff = new Difference(s1, s2);
		union = new Union(s1, s2);
	}
	
	@Test
	public void unionTest() throws Exception {
		//zawiera siê w sumie
		assertTrue(union.contains(5, 5));
		assertTrue(union.contains(10, 10));
		
		//nie zawiera siê
		assertTrue(!union.contains(0, 11));
		assertTrue(!union.contains(10, 12));
	}
	
	@Test
	public void DiffTest() throws Exception {
		//zawiera siê w difie
		assertTrue(diff.contains(1, 1));
		
		//nie zawiera siê w odejmowaniu zbiorów
		assertTrue(!diff.contains(10, 10));
	}
	
	@Test
	public void InterTest() throws Exception {
		//zawiera siê w przeciêciu
		assertTrue(inter.contains(9.5f, 9.5f));
		
		//nei zawiera siê w przeciêciu
		assertTrue(!inter.contains(10f, 10f));
	}
}
