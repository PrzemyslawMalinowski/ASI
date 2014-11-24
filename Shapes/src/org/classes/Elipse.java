package org.classes;

import org.interfaces.Shape;

public class Elipse extends Position implements Shape {
	
	protected int r1;
	protected int r2;

	@Override
	public boolean contains(float x, float y) {
		return false;
	}
	
	public Elipse(int x, int y, int r1, int r2) {
		this.x = x;
		this.y = y;
		this.r1 = r1;
		this.r2 = r2;
	}

	@Override
	public double getArea() {
		return 3.14 * r1 * r2;
	}
}
