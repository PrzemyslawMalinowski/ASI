package org.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.classes.*;

public class MultiKultiTests {

	private Rectangle rec1;
	private Rectangle rec2;
	private Rectangle rec3;

	private Elipse el1;
	private Elipse el2;
	private Elipse el3;

	private Union union;
	private Union union2;
	private Union union3;
	private Intersection inter;
	private Difference diff2;
	private Difference diff;

	private Translated trans;
	private Rotated rot;

	public MultiKultiTests() {
		
		rec1 = new Rectangle(5, 10);
		rec2 = new Rectangle(50, 50);
		rec3 = new Rectangle(13, 19);

		el1 = new Elipse(10, 10);
		el2 = new Elipse(20, 30);
		el3 = new Elipse(50, 20);
		
		trans = new Translated(10, 10, el1);
		rot = new Rotated(100, 100, 45, rec2);
		
		union = new Union(trans, rec1);
		diff = new Difference(el2, rec3);
		inter = new Intersection(rot, el2);
		
		union2 = new Union(union, diff);
		diff2 = new Difference(inter, diff);
		
		union3 = new Union(union2, diff2);
	}

	@Test
	public void test() {
		
	}

}
