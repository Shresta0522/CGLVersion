import java.util.Scanner;

public class Grid extends Game{

	/**
     * Creates initial generation [board]
     * @param n  size of the board n X n
     * @param l[][]  array of live cells
     */
	
//	private int l[][];
	private int n;
	public Grid() {
		
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
        return board;
    }
	
	
	//
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
	public static void manin(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		        
//		        // Reading size of the Board
//		        int n = sc.nextInt();
//		        
//		        // Reading no. of initial live cells
//		        int m = sc.nextInt();
//		        int[][] l = new int[m][2];
//		        int i = 0;
//		        
//		        // Reading Live cells
//		        while (sc.hasNextInt()) {
//		            l[i][0] = sc.nextInt();
//		            l[i++][1] = sc.nextInt();
//		        }
//		        
//		        // creating instance to CGLVersion2
//		        Grid c = new Grid();
//		        
//		        // creating nextgeneratin by calling nextgenration method
//		        Game.generateNextGeneration(c.createBoard(n, l));
//		        sc.close();
		    }
}

