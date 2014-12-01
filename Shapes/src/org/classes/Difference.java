package org.classes;

import org.interfaces.Shape;

public class Difference implements Shape {
	
	private Shape sh1;
	private Shape sh2;
	
	public Difference(Shape sh1, Shape sh2) {
		this.sh1 = sh1;
		this.sh2 = sh2;
	}

	@Override
	public boolean contains(float x, float y) {
		return sh1.contains(x, y) && !sh2.contains(x, y);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
