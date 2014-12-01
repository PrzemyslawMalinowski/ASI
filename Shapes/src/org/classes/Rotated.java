package org.classes;

import org.interfaces.Shape;

public class Rotated implements Shape {
	
	protected float x;
	protected float y;
	protected float angle;
	protected Shape shape;
	
	public Rotated(float x, float y, float angle, Shape shape){
		this.x = x;
		this.y = y;
		this.angle = angle;
		this.shape = shape;
	}

	@Override
	public boolean contains(float x, float y) {
		float x2 = (float)((this.x - x) * Math.cos(angle) - (this.y - y) * Math.sin(angle));
		float y2 = (float)((this.x - x) * Math.sin(angle) - (this.y - y) * Math.cos(angle));
		
		return shape.contains(x2, y2);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
