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
	 * 
	 * main method reads the input for size of the board 
	 * Reads the live cells given from the input which will be the first generation.
	 * It prints the next generation board of the given  current board
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading size of the Board
        int n = sc.nextInt();
        
        // Reading no. of initial live cells
        int m = sc.nextInt();
        int[][] l =  new int[m][2];
        int i = 0;
        
        // Reading Live cells
        while (sc.hasNextInt()) {
            l[i][0] = sc.nextInt();
            l[i++][1] = sc.nextInt();
        }
        
        // creating instance to CGLVersion2
        Grid c = new Grid(n);
        
//        c.printBoard(c.createBoard(n, l));
        
        // creating nextgenratin by calling nextgenration method
        c.generateNextGeneration(c.createBoard(n, l));
        c.printBoard(c.generateNextGeneration(c.createBoard(n, l)));
    
        sc.close();
    }
	

		
    }
	

