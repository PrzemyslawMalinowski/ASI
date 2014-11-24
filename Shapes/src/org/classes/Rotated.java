package org.classes;

import org.interfaces.Shape;

public class Rotated implements Shape {
	
	protected float f1;
	protected float f2;
	protected float angle;
	protected Shape shape;
	
	Rotated(float x, float y, float angle, Shape shape){
		this.f1 = x;
		this.f2 = y;
		this.angle = angle;
	}

	@Override
	public boolean contains(float x, float y) {
		return shape.contains(x, y);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
