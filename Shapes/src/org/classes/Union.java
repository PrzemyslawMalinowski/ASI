package org.classes;

import org.interfaces.Shape;

public class Union implements Shape{
	
	protected Shape shape1;
	protected Shape shape2;
	
	public Union(Shape shape1, Shape shape2){
		this.shape1 = shape1;
		this.shape2 = shape2;
	}

	@Override
	public boolean contains(float x, float y) {
		return shape1.contains(x, y) || shape2.contains(x, y);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
