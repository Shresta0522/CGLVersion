import java.util.Scanner;

/**
 * The Game class should provide basic operations such as 
 * generating next generation until it stops.
 * 
 * 
 * 
 *
 * @author Shresta
 * 
 *
 */


public class Game {
	
	
	/**
	 * @author <Shresta and <2020501008>
	 * @param noOfGenerations
	 */
//	public int noOfGenerations;
//	
//	
//	 
	/**
	 * 
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading size of the Board
        int n = sc.nextInt();
        
        // Reading no. of initial live cells
        int m = sc.nextInt();
        int[][] l = {
                {1, 1, 1, 0, 1, 1, 1, 0, 0},
                {1, 1, 1, 0, 0, 0, 0, 1, 0},
                {1, 1, 1, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 1, 1, 1}
        		};
        int i = 0;
        
        // Reading Live cells
        while (sc.hasNextInt()) {
            l[i][0] = sc.nextInt();
            l[i++][1] = sc.nextInt();
        }
        
        // creating instance to CGLVersion2
        Grid c = new Grid(n);
        
        // creating nextgenratin by calling nextgenration method
        c.generateNextGeneration(c.createBoard(n, l));
        sc.close();
    }
			
}
