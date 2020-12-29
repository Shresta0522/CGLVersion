
/**
 * The Cell class should provide basic operations such as 
 * add live cells in a particular cell.
 * 
 * 
 * 
 * @author <Shresta>
 * 
 *
 */


public class Cell {
	
	private int x;
	private int y;
//	private int[][] alive;
	public boolean aliveCell;
	
	
	/**
	 * This is a constructs for the input values that is given for the live cells
	 * x is the row position.
	 * y is the column position.
	 * 
	 *
	 * @param x
	 * @param y
	 * @param aliveCell
	 */
	public Cell(int x,int y,boolean aliveCell){
		this.x=x;
		this.y=y;
		this.aliveCell=aliveCell;
		
	}
	

	/**
	 * This is a getter method
	 * returns the x value
	 */
	
	public boolean alive() {
		return aliveCell;
		
		
	}
	
	/**
	 * This is a getter method
	 * returns the x value
	 */
	public int getx() {
		return x;
		
	}
	
	/**
	 * This is a getter method
	 * returns the y value
	 */
	public int gety() {
		return y;
		
	}
	
	@Override
    public String toString() {
        return "Cell{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
	
	
	
	
	
	

