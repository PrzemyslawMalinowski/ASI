package org.classes;

import org.interfaces.Shape;

public class Translated implements Shape {
	
	protected Shape shape;
	private float x;
	private float y;
	
	public Translated(float x, float y, Shape shape){
		this.x = x;
		this.y = y;
		this.shape = shape;
	}

	@Override
	public boolean contains(float x, float y) {
		return shape.contains(x - this.x, y - this.y);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
