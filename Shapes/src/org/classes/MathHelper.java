package org.classes;

public class MathHelper {
	
	public static float Distance(float startX, float startY, float stopX, float stopY){
		double t1 = Math.pow(startX + startY, 2);
		double t2 = Math.pow(stopX + stopY, 2);
		
		return (float) Math.pow(t1 + t2, .5);
	}
	
}
