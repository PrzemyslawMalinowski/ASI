package org.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.interfaces.Shape;

public class Rectangle extends Position implements Shape {

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
		return (this.x < x && x < this.x + a) && (this.y < y && y < this.y + b) ? true : false;
	}

	@Override
	public double getArea() {
		return a * b;
	}

}
