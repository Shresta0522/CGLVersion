

public class Game {
	
	public int noOfGenerations;
	
	
	 public void generateNextGeneration(boolean board[][]) {
		 boolean[][] next_gen = new boolean[board.length][board.length];
	        for(int i=0;i<board.length;i++){
	            for(int j=0;j<board.length;j++){
	                int live_cells = Cell.countLiveCells(i,j,board);

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
	        printBoard(next_gen);
	        

		 

	    }

	
			
}
