/**
 * 
 */
package edu.cofc.csci221.ui;

/**
 * @author Austin Abt
 * @since October 1st, 2014
 * This class creates and sets x and y values for points for use in the line class as well
 * as the provided grid classes for this assignment.
 */
public class Point {
	private int bigx;
	private int bigy;

	/**
	 * @param initialize instance variables to zero
	 */
	Point () {
		bigx = 0;
		bigy = 0;
	}
	/**
	 * 
	 * @param point: point that initializes instance variables to new points x and
	 * y variables. Uses setPoint(point) to eliminate code reuse and save on space
	 */
	Point (Point point)  {
		setPoint(point);
		 
	}
	/**
	 * 
	 * @param x: use provided x to initialize instance variable x to this value
	 * @param y: use provided y to initialize instance variable y to this value
	 * Uses setX() and setY() to eliminate code reuse and save on space
	 */
	Point (int x, int y){
		
		setX(x);
		setY(y);
		
	}
	/**
	 * 
	 * @return X and Y getters to return instance variables
	 */
	public int getX(){
		return bigx;
	}
	public int getY(){
		return bigy;
	}
	public void setX(int x){
		if (x>=0 && x<=GridConstants.MAX_PANEL_WIDTH) {
			/**
			 * set x instance variable  to value in parameter
			 */
			bigx = x;
			
		} else {
			/**
			 * set x instance variable to 0
			 */
			bigx = 0;
		}
		
	}
	
	public void setY(int y){
		if (y>=0 && y<=GridConstants.MAX_PANEL_HEIGHT) {
			/**
			 * set y instance variable  to value in parameter
			 */
			bigy = y;
			
		} else {
			/**
			 * set y instance variable to 0
			 */
			bigy = 0;
		}
	}
	/**
	 * 
	 * @param p: set to an existing point object that meets conditions of the setX and 
	 * setY methods. Uses setX(p.getX()) and setY(p.getY()) to eliminate code reuse by passing 
	 * the variables through the set and get methods.
	 */
	public void setPoint(Point p){
		if (p != null){
			
			setX(p.getX());
			
			setY(p.getY());
			
		}
		
	}
	
}
