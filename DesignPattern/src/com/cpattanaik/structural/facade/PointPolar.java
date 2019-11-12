/**
 * 
 */
package com.cpattanaik.structural.facade;


public class PointPolar {
	private double radius, angle;

    public PointPolar(double radius, double angle) {
        this.radius = radius;
        this.angle = angle;
    }

    public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	public void  rotate(int angle) {
        this.angle = (this.angle + angle) % 360;
    }

    public String toString() {
        return "[" + radius + "@" + angle + "]";
    }
}
