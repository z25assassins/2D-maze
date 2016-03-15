import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Maze {
	
		String movement = "X ";
		String path = ".";
		String wall = "#";
		
		int row = 0;
		int col = 0;
		int forwardHand;
		int rightHand;
		int handY;

		public void traverseMaze(int row, int col, int forwardHand, int rightHand) throws FileNotFoundException {

		
			
			File readFile = new File("C:/Users/zkiam/Documents/MSU/Basic data structures and algorithims/MazeOutlab/src/maze.txt");
			Scanner sc = new Scanner(readFile);
			//gets the first one
			
			for(int rowCount = 0; rowCount <= 11 ; rowCount ++){
				
				row = rowCount;
				forwardHand = rowCount +1;
				
				for(int colCount = 0; colCount <= 1; colCount++){
					col = colCount;
					rightHand = colCount +1;
					String[][] path = new String[row][col];
					
					System.out.println(path);

				}
				//trim it up
			
			System.out.println(sc.nextLine().trim());
			
			this.row = row;
			this.col = col;
			this.forwardHand = forwardHand;
			this.rightHand = rightHand;
			
//			System.out.println(this.row);
//			System.out.println(this.col);
//			System.out.println(this.forwardHand);
//			System.out.println(this.rightHand);
			
			
		}
		
	}
}


//if row and hand row are equal, your facing south
//if its greater than or less than North 

//if right is # move forward
//if forward is # turn right
//if right is . move right


//one method to read file from txt
//one method recursive to move around
//if it is a dot or X you move there.

	