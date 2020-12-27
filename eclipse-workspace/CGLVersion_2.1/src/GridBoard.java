/**
 * The Grid class should provide basic operations such as 
 * create board, print board, count of live cells and Next generation.
 * 
 * 
 * 
 * @author <Shresta> 2020501008
 * 
 * 
 */



public class GridBoard {
	
	
	/** *************Rules of Life********************* 
	 * Lonely cell will die ==> aliveNeighbours < 2 ;
	 * Cell will die due to overpopulation ==> aliveNeighbours > 3 
	 * A new cell will born ==> if currently dead cell have aliveNeighbours == 3
	 * 
	 * 
	 * @author <Shresta and <2020501008>
	 */

	/**
     * Creates initial generation [board]
     * @param n  size of the board n X n
     * @param l[][]  array of live cells
     */
	
//	private int l[][];
	private int n;
	
	public GridBoard(int n) {
		this.n=n;
		
	}
	
	/**
     * Creates initial generate[]
     * @param n  size of the board n X n
     * @param l[][]  array of live cells
     */
	public boolean[][] createBoard(int n,int l[][]) {
		int row,col;
        boolean[][] board=new boolean[n][n];
        for(int i=0;i<l.length;i++){
        row=l[i][0];
        col=l[i][1];
        board[row][col]=true;
        }
        System.out.println("CurrentGenration");
        System.out.println();
        return board;
    }
	
	
	/**
     * Method to generate a next generation. Call the printBoard
     * to print the next generation.
     * returns a array of string and prints the board
     * @param board[][]
     * @param n
     * @return
     */
	public void printBoard(boolean board[][]) 
    {
		String[][] print=new String[board.length][board.length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++)
            {
//            	int l[][];
                if(board[i][j]){
                    System.out.print("*");
                	print[i][j]="*";
                }
                else{
                    System.out.print(".");
                    print[i][j]=".";
                }
                if(j<board.length-1){
                    System.out.print("");
//                    print[i][j]="#";
                }
                
            }
            System.out.println();
        }
//        System.out.println(print);
//        return print;
    }
	
	
	
	
	
	/**
	 * This method is for counting the live cells of a particular position.
	 * returns the count of total live cells of a particular position.
	 * @param m is the row position
	 * @param n is the column position
	 */
	public int countLiveCells(int m,int n,boolean[][] board){
	      int live_cells=0;
	      for(int i=m-1;i<=m+1;i++)
	      {
//	    	  System.out.println("entered for loop");
	          for(int j=n-1;j<=n+1;j++)
	          {
//	        	  System.out.println("entered for loop");
	              if(i!=m || j!=n)
	              {
//	            	  System.out.println("entered");
	                  if(i>=0 && i<board.length && j>=0 && j<board.length && board[i][j])
	                  {
//	                	  System.out.println("entered");
	                      live_cells+=1;
	                  }
	              }
	          }
	      }
//	      System.out.println(live_cells);
	      return live_cells;
	  }
		
	
	/**
     * Method to generate a next generation. Call the printBoard
     * to print the next generation.
     * returns a boolean[][] array of the next generation.
     * @param board[][] board
     * 
     */
	
	public boolean[][] generateNextGeneration(boolean board[][]) {
		 boolean[][] next_gen = new boolean[board.length][board.length];
	        for(int i=0;i<board.length;i++){
	            for(int j=0;j<board.length;j++){
	                int live_cells = countLiveCells(i,j,board);

	                if(board[i][j]){
	                    if(live_cells<2 || live_cells>3){ 
	                        next_gen[i][j]=false;
	                    }
	                    else if(live_cells<=3)
	                    {
	                        next_gen[i][j]=true;
	                    }
	                }
	                else{
	                    if(live_cells==3){
	                        next_gen[i][j] = true;
	                    }
	                    else{
	                        next_gen[i][j] = false;
	                    }
	                }
	                
	                
	            }
	        }
	        return next_gen;
	}
	
}
