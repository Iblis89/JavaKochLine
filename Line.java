/**
 * 
 */
package edu.cofc.csci221.ui;

/**
 * @author Austin Abt
 * @since October 7th 2014
 * This class creates lines using the point class for use in the provided Grid classes
 * to display in a UI.
 */
public class Line {
	/**
	 * initialize instance variables to null
	 */
	private Point bigstart = null;
	private Point bigend = null;
	/**
	 * 
	 * @param start: point that acts as the start of the line (cannot be null)
	 * @param end: point that acts as the end of the line (cannot be null)
	 */
	Line(Point start, Point end){
		if (start != null && end != null){
		bigstart = start;
		bigend = end;
		}
	}
	/**
	 * 
	 * Following 4 methods are getters and setters to return start or end and
	 * set the instance variable start and end (provided they are not null), respectively. 
	 */
	public Point getStart(){
		return bigstart;
	}
	
	public Point getEnd(){
		return bigend;
	}
	
	public void setStart(Point start){
		if (start != null){
			bigstart = start;
		}
	}
	
	public void setEnd(Point end){
		if (end != null){
			bigend = end;
		}
	}
	
	/**
	 * Boolean that checks if the start and end points are valid (not null)
	 * @return: true if bigstart and bigend are not null, otherwise false
	 */
	
	public boolean isValid(){
		if (bigstart != null && bigend != null){
			return true;
		} else {
			return false;
		}
	}

}
