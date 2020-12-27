import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The ComplexNumber class should provide basic operations such as 
 * addition, subtraction, multiplication and division.
 * 
 * 
 * @author <Student Name>
 * 
 * @version: 1.0
 */

public class TestJunitGame {
	

	/**
	 * This method
	 * 
	 */
	@Test
    public void positionTest(){
		Cell cell1 = new Cell(2,4,true);
		Assertions.assertEquals(2,cell1.getx());
		
	}
	
	/**
	 * This method
	 * 
	 */
	@Test
    public void positionTest2(){
		Cell c = new Cell(2,4,true);
		Assertions.assertEquals(4,c.gety());
		
	}
	
	/**
	 * This method
	 * 
	 */
	@Test
    public void positionTest3(){
		Cell c2 = new Cell(2,4,true);
		Assertions.assertEquals(true,c2.alive());
		
	}
	
	/**
	 * This method
	 * 
	 */
	@Test
    public void boardPrintTest(){
		Grid g1 = new Grid(5);
		boolean[][] eIutput1= {
				{false,false,false,false,false},
				{false,false,false,true,false},
				{false,false,false,false,true},
				{false,false,false,false,false},
				{false,false,false,false,false}
				};
		String[][] tboard= {
				{".",".",".",".","."},
				{".",".",".","*","."},
				{".",".",".",".","*"},
				{".",".",".",".","."},
				{".",".",".",".","."}
				
		};
		
//		Assertions.asserttrue(g1.printBoard(eIutput1););
		
	}
	
	/**
	 * This method test the board created with the given live cells
	 * 
	 */
	@Test
	public void createBoardTest(){
		Grid g1 = new Grid(5);
		int m[][]= {{1,3},{2,4}};
		boolean[][] tboard=g1.createBoard(5,m);
		boolean[][] eOutput= {
				{false,false,false,false,false},
				{false,false,false,true,false},
				{false,false,false,false,true},
				{false,false,false,false,false},
				{false,false,false,false,false}
				};
		System.out.println("***createBoardTest**********");
//		System.out.println(tboard);
		Assertions.assertEquals(eOutput,tboard);
//		for (int i=0;i<tboard.length;i++) {
//			for(int j=0;j<tboard[i].length;j++) {
//				System.out.print(tboard[i][j]+" ");
////				Assertions.assertEquals(true,g1.createBoard(5,m));
//			}
//			System.out.println("");
//		}
//		
	}
		
		/**
		 * This method test the next generation of the given input array
		 * 
		 * 
		 */
		@Test
	    public void nextgen(){
			Grid grid = new Grid(5);
			boolean input[][]= {
					{false,false,false,false,false},
					{false,false,true,true,false},
					{false,false,false,true,false},
					{false,false,false,false,false},
					{false,false,false,false,false}
					};
//			boolean expectedOutput[][]= {
//					{false,false,false,false,false},
//					{false,false,true,true,false},
//					{false,false,true,true,false},
//					{false,false,false,false,false},
//					{false,false,false,false,false}
//					};
			
//			grid.printBoard(expectedOutput);
			
			System.out.println("*******check the generation************");
			boolean tboard[][]=grid.generateNextGeneration(input);
//			grid.printBoard(tboard);
//			Assertions.assertEquals(grid.printBoard(expectedOutput),grid.printBoard(tboard));
//			String[][] printb=grid.printBoard(tboard);
			Assertions.assertEquals(".,.,.,.,.\n.,.,*,*,.\n.,.,*,*,.\n.,.,.,.,.\n",tboard);
		
		}
		
		/**
		 * This method
		 * 
		 */
		
		@Test
	    public void countLiveCellTest4(){
			Grid g1 = new Grid(5);
			boolean inputbox[][]= {
					{false,false,false,false,false},
					{false,false,true,true,false},
					{false,false,false,true,false},
					{false,false,false,false,false},
					{false,false,false,false,false}
					};
			System.out.println("******Livecells count****************");
			
//			System.out.println(g1.countLiveCells(1,3 , inputbox));
			
			Assertions.assertEquals(2,g1.countLiveCells(1,3 , inputbox));
			
		}
		
		
//		System.out.println(tboard);
		
//		for (int i=0;i<tboard.length;i++) {
//			for(int j=0;j<tboard[i].length;j++) {
//				System.out.print(tboard[i][j]+" ");
//				
//			}
//			System.out.println("");
//		}
//		Assertions.assertEquals(g1.printBoard(tboard));
		
//	@Test
//    public void boardTest1(){
//		Grid g1 = new Grid(5);
//		int m[][]= {{1,2},{1,3},{2,2},{3,4}};
////		g1.generateNextGeneration(m);
////		g1.printBoard(tboard);
//	}

	
	
		
		
		
//		Assertions.assertEquals(true,g1.printBoard(tboard););
		
	
	
	

//        Assert.assertTrue(gameBoard.isCellAlive(0, 0));
    

}
