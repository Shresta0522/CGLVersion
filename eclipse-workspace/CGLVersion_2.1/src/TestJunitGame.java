import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunitGame {
	
	
   public void Grid() {
		Grid cn1 = new Grid();
		String outbound="*.\n"+".*";
       System.out.println("======TEST ONE EXECUTED=======");
       Assertions.assertEquals(outbound,cn1.createBoard(1,null));
	}
//	
	@Test
    public void positionTest(){
		Cell cell1 = new Cell(2,4);
		Assertions.assertEquals(1,cell1.getx());
		
	}
	
	@Test
    public void positionTest2(){
		Cell c = new Cell(2,4);
		Assertions.assertEquals(2,c.gety());
		
	}
	
	@Test
    public void positionTest3(){
		Cell c2 = new Cell(2,4);
		Assertions.assertEquals(false,c2.alive());
		
	}
	
	@Test
    public void positionTest4(){
		Cell c3= new Cell(2,4);
		Assertions.assertEquals(c3.countLiveCells(2,3,null));
		
	}

//        Assert.assertTrue(gameBoard.isCellAlive(0, 0));
    

}
