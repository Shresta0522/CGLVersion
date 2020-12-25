import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunitGame {
	
	
	@Test
    public void Test(){
		Grid grid = new Grid(5);
		boolean input[][]= {
				{false,false,false,false,false},
				{false,false,true,true,false},
				{false,false,false,true,false},
				{false,false,false,false,false},
				{false,false,false,false,false}
				};
		boolean expectedOutput[][]= {
				{false,false,false,false,false},
				{false,false,true,true,false},
				{false,false,true,true,false},
				{false,false,false,false,false},
				{false,false,false,false,false}
				};
		
		
		System.out.println("*******check the generation************");
		boolean[][] tboard=grid.generateNextGeneration(input);
		grid.printBoard(tboard);
		Assertions.assertEquals(expectedOutput,grid.generateNextGeneration(input));
//		boolean[][] tboard=grid.generateNextGeneration(input);
//		grid.printBoard(tboard);
	}
//   public void Grid() {
//		Grid cn1 = new Grid();
//		String outbound="*.\n"+".*";
//       System.out.println("======TEST ONE EXECUTED=======");
//       Assertions.assertEquals(outbound,cn1.createBoard(1,null));
//	}
//	
	@Test
    public void positionTest(){
		Cell cell1 = new Cell(2,4,true);
		Assertions.assertEquals(2,cell1.getx());
		
	}
	
	@Test
    public void positionTest2(){
		Cell c = new Cell(2,4,true);
		Assertions.assertEquals(4,c.gety());
		
	}
	
	@Test
    public void positionTest3(){
		Cell c2 = new Cell(2,4,true);
		Assertions.assertEquals(true,c2.alive());
		
	}
	
//	
	@Test
    public void boardPrintTest(){
		Grid g1 = new Grid(5);
		int m[][]= {{1,2},{1,3},{2,2}};
		boolean[][] tboard=g1.createBoard(5,m);
		System.out.println("***boardPrintTest**********");
		g1.printBoard(tboard);
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

	
	@Test
	public void createBoardTest(){
		Grid g1 = new Grid(5);
		int m[][]= {{1,3},{2,4}};
		boolean[][] tboard=g1.createBoard(5,m);
		System.out.println("***createBoardTest**********");
		System.out.println(tboard);
	
		for (int i=0;i<tboard.length;i++) {
			for(int j=0;j<tboard[i].length;j++) {
				System.out.print(tboard[i][j]+" ");
//				Assertions.assertEquals(true,g1.createBoard(5,m));
			}
			System.out.println("");
		}
		
		
		
//		Assertions.assertEquals(true,g1.printBoard(tboard););
		
	}
//	@Test
//    public void positionTest4(){
//		Cell c3= new Cell(2,4);
//		Assertions.assertEquals(c3.countLiveCells(2,4,false));
//		
//	}

//        Assert.assertTrue(gameBoard.isCellAlive(0, 0));
    

}
