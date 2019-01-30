package sudoko;

import java.util.Random;

public class Sudoko {
	
	
	static final int max = 3;
	static final int min = 0;
    
	static final int digitMax = 4; 
	static final int digitMin = 1;
    

	public static void main(String[] args) {
		
	
	    int row = 0;
        int col = 0;
        
        int randomNumber = 0;
		
		int[][] grid = new int[4][4]; //Skapa en 2D array med 4*4 rutor
		
		Random random = new Random();
		
		
		for (int i = 1; i <= 6; i++) {
			
            row = random.nextInt((max - min) + 1) + min;
            col = random.nextInt((max - min) + 1) + min;
            
            randomNumber = random.nextInt((digitMax - digitMin) + 1) + digitMin;
                                   
            if (checkConflict(grid, row, col, randomNumber)) {
                grid[row][col] = randomNumber;
                
            } else {
            	
                i--;
            }
            
	}
		
		// Skriv ut i konsolen
		for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(grid[i][j] + "  ");
	            }
	            System.out.println();
	        }
			
}
	
	
	public static boolean checkConflict(int[][] theArray, int theRow, int theCol, int theNum) { //Kolla om nummer finns i den aktuella raden eller kolumnen
		
		 for (int i = 0; i < 4; i++) {
			 
	            if (theArray[theRow][i] == theNum) {
	                return false;
	            }
	            if (theArray[i][theCol] == theNum) {
	                return false;
	            }
	        }
	
		return true;
	}
	
}