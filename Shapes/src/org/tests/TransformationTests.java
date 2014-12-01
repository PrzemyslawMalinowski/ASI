package org.tests;

import static org.junit.Assert.*;

import org.classes.Rectangle;
import org.classes.Rotated;
import org.classes.Translated;
import org.junit.Test;

public class TransformationTests {
	
	private Rotated rot;
	private Translated trans;
	
	private Rectangle rec;
	
	public TransformationTests() {
		rec = new Rectangle(10, 10);
		rot = new Rotated(100, 100, 45, rec);
		trans = new Translated(10, 15, rec);
	}

	@Test
	public void TransformationTest() {
		assertTrue(!trans.contains(13, 13));
		assertTrue(!trans.contains(15, 20));
	}
	
	public void RotatedTest() {
		assertTrue(!trans.contains(10, 10));
		assertTrue(!trans.contains(100, 100));
	}

}