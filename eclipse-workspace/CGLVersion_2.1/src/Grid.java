import java.util.Scanner;

/** *************Rules of Life********************* 
 * Lonely cell will die ==> aliveNeighbours < 2 ;
 * Cell will die due to overpopulation ==> aliveNeighbours > 3 
 * A new cell will born ==> if currently dead cell have aliveNeighbours == 3
 * 
 * 
 * @author <Shresta and <2020501008>
 */

public class Grid {

	/**
     * Creates initial generation [board]
     * @param n  size of the board n X n
     * @param l[][]  array of live cells
     */
	
//	private int l[][];
	private int n;
	
	public Grid(int n) {
		this.n=n;
		
	}
	public boolean[][] createBoard(int n,int l[][]) {
		int row,col;
        boolean[][] board=new boolean[n][n];
        for(int i=0;i<l.length;i++){
        row=l[i][0];
        col=l[i][1];
        board[row][col]=true;
        }
        System.out.println("CurrentGenration");
        System.out.println(board);
        return board;
    }
	
	
	/**
     * print the board.
     * @param board[][]
     * @param n
     * @return
     */
	public void printBoard(boolean board[][]) 
    {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++)
            {
            	int l[][];
                if(board[i][j]){
                    System.out.print("*");
                }
                else{
                    System.out.print(".");
                }
                if(j<board.length-1){
                    System.out.print("");
                }
                
            }
            System.out.println();
        }
    }
	
	
	public int  getn(){
		return n;
	}
	
	
	/**
	 * counting the live cells in a board
	 */
	public int countLiveCells(int m,int n,boolean[][] board){
	      int live_cells=0;
	      for(int i=m-1;i<=m+1;i++)
	      {
	          for(int j=n-1;j<=n+1;j++)
	          {
	              if(i!=m || j!=n)
	              {
	                  if(i>=0 && i<board.length && j>=0 && j<board.length && board[i][j])
	                  {
	                      live_cells+=1;
	                  }
	              }
	          }
	      }
	      return live_cells;
	  }
		
	
	/**
     * Method to generate a next generation. Call the printBoard
     * to print the next generation.
     * 
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

