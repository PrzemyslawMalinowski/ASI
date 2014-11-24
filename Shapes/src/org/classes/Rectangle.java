package org.classes;

import org.interfaces.Shape;

public class Rectangle extends Position implements Shape{
	
	private float a;
	private float b;
	
	public Rectangle(float x, float y, float a, float b) {
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
	}

	@Override
	public boolean contains(float x, float y) {
		return false;
	}

	@Override
	public double getArea() {
		return a * b;
	}
	
}
