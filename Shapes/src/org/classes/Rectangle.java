package org.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.interfaces.Shape;

public class Rectangle implements Shape {

	private float a;
	private float b;

	public Rectangle(float a, float b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public boolean contains(float x, float y) {
		return (-0.5 * a < x && x < 0.5 * a) && (-0.5 < y && y < 0.5 + b) ? true : false;
	}

	@Override
	public double getArea() {
		return a * b;
	}

}
