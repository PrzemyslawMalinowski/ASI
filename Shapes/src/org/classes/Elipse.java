package org.classes;

import org.interfaces.Shape;

public class Elipse implements Shape {
	
	protected int r1;
	protected int r2;

	@Override
	public boolean contains(float x, float y) {
		return (Math.pow(x, 2) / Math.pow(r1, 2) + 
				Math.pow(y, 2) / Math.pow(r2, 2)) < 1 ? true : false;
	}
	
	public Elipse(int r1, int r2) {
		this.r1 = r1;
		this.r2 = r2;
	}

	@Override
	public double getArea() {
		return 3.14 * r1 * r2;
	}
}
