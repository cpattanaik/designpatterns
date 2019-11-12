/**
 * 
 */
package com.cpattanaik.structural.facade;

/**
 * @author c0p00fy
 *
 */
public class Point {
	private PointCartesian pointCartesian;

    public Point(double x, double y) {
        pointCartesian = new PointCartesian(x, y);
    }

    public String toString() {
        return pointCartesian.toString();
    }

    public void move(int x, int y) {
        pointCartesian.move(x, y);
    }

    public void rotate(int angle, Point o) {
        double x = pointCartesian.getX() - o.pointCartesian.getX();
        double y = pointCartesian.getY() - o.pointCartesian.getY();
       
        double r = Math.sqrt(x * x + y * y);
        double thita = Math.atan2(y, x) ;
        PointPolar pointPolar = new PointPolar(r, thita);
        pointPolar.rotate(angle);
       
        x = (int) (pointPolar.getRadius() * Math.cos(pointPolar.getAngle()));
        y = (int) (pointPolar.getRadius() * Math.sin(pointPolar.getAngle()));
        pointCartesian = new PointCartesian(x, y);
    }

}
