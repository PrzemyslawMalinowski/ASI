package org.tests;

import static org.junit.Assert.*;

import org.classes.Rectangle;
import org.junit.Test;

public class RectangleTest {
	
	private Rectangle rec;
	
	public RectangleTest(){
		rec = new Rectangle(10, 10, 100, 100);
	}

	@Test
	public void test() {
		
		//w prostok¹cie
		assertTrue( rec.contains(20, 20));
		assertTrue( rec.contains(20, 30));
		
		//poza prostok¹tem
		assertTrue( !rec.contains(10, 10));
		assertTrue( !rec.contains(110, 110));
		assertTrue( !rec.contains(0, 0));
	}

}
