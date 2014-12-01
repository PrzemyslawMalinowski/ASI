package org.classes;

import org.interfaces.Shape;

public class Intersection implements Shape {
	
	private Shape s1;
	private Shape s2;
	
	public Intersection(Shape s1, Shape s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	@Override
	public boolean contains(float x, float y) {
		return s1.contains(x,y) && s2.contains(x, y);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
