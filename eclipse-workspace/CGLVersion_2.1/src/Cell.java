
public class Cell extends Game {
	
	private int x;
	private int y;
	public static boolean aliveCell[][];
	
	public Cell(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	
	public boolean[][] alive() {
		return aliveCell;
		
		
	}	
	public int getx() {
		return x;
		
	}
	
	public int gety() {
		return x;
		
	}
	
//	public static int countLiveCells(int m,int n,boolean[][] board){
//        int live_cells=0;
//        for(int i=m-1;i<=m+1;i++)
//        {
//            for(int j=n-1;j<=n+1;j++)
//            {
//                if(i!=m || j!=n)
//                {
//                    if(i>=0 && i<board.length && j>=0 && j<board.length && board[i][j])
//                    {
//                        live_cells+=1;
//                    }
//                }
//            }
//        }
//        return live_cells;
//    }
	
	
	
	
	
}
