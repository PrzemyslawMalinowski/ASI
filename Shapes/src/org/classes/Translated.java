package org.classes;

import org.interfaces.Shape;

public class Translated extends Position implements Shape {
	
	protected Shape shape;
	
	protected float f1;
	protected float f2;
	
	public Translated(float x, float y, Shape shape){
		this.f1 = x;
		this.f2 = y;
		this.shape = shape;
	}

	@Override
	public boolean contains(float x, float y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
