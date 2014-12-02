package edu.cofc.csci221.ui;

/**
 * @author Austin Abt
 * @since November 28th, 2014
 * This class inherits the Line class to create a Koch line using the provided algorithm. The KochLine is composed of
 * 5 points with specific coordinates relative to the values of the first and last points.
 **/
public class KochLine extends Line {

	private Point p1 = null;
	private Point p2 = null;
	private Point p3 = null;
	private Point p4 = null;
	private Point p5 = null;
	/**
	 * 
	 * @param start:starting point of the line
	 * @param end:ending point of the line
	 * this constructor makes the Koch line using the first point, p1, as the start and the last, p5, as the end.
	 * calls the super constructor and assigns values to p1 and p5. 
	 */
	public KochLine(Point start, Point end){
		super(start, end);
		p1 = start;
		p5 = end;
	}
	/**
	 * pre or post conditions: none
	 * @return: KochLine object
	 * creates the first line segment of the Kochline using points p1 and p2.
	 * 
	 */
	public KochLine getLineA(){
		KochLine KochLine = new KochLine (p1,p2);
		return KochLine;
	}
	/**
	 * pre or post conditions: none
	 * @return: KochLine object
	 * creates the second line segment of the Kochline using points p1 and p2.
	 * 
	 */
	public KochLine getLineB(){
		KochLine KochLine = new KochLine (p2,p3);
		return KochLine;
	}
	/**
	 * pre or post conditions: none
	 * return: KochLine object
	 * creates the third line segment of the Kochline using points p1 and p2.
	 * 
	 */
	public KochLine getLineC(){
		KochLine KochLine = new KochLine (p3,p4);
		return KochLine;
	}
	/**
	 * pre or post conditions: none
	 * @return: KochLine object
	 * creates the fourth line segment of the Kochline using points p1 and p2.
	 * 
	 */
	public KochLine getLineD(){
		KochLine KochLine = new KochLine (p4,p5);
		return KochLine;
	}
	/**
	 * pre or post conditions: none
	 * computes the x and y values of p2,p3, and p4 using the provided algorithm. 
	 */
	public void computeFractal(){
		int x1 = p1.getX();
		int y1 = p1.getY();
		int x5 = p5.getX();
		int y5 = p5.getY();
		int difx = x5 - x1;
		int dify = y5 - y1;
		int x2 = (x1 +(difx/3));
		int y2 = (y1 +(dify/3));
		int x3 = (int) (((x1+x5)/2) + ((Math.sqrt(3) * (y1-y5))/6));
		int y3 = (int) (((y1+y5)/2) + ((Math.sqrt(3) * (x5-x1))/6));
		int x4 = x1 + ((2*difx)/3);
		int y4 = y1 + ((2*dify)/3);
		
		p2 = new Point(x2,y2);
		p3 = new Point(x3,y3);
		p4 = new Point(x4,y4);
		p5 = new Point(x5,y5);
		
		
	}
	/**
	 * pre and post conditions: none
	 * @return: true if all lines are valid, false otherwise. 
	 * checks if the kochline is valid by checking each segment for validity individually.
	 */
	public boolean isKochLineValid(){
		if (getLineA().isValid() == true && getLineB().isValid() == true &&
				getLineC().isValid() == true && getLineD().isValid() == true){
			return true;
			
		}else{
			return false;
		}
			
		
	}
	
}
