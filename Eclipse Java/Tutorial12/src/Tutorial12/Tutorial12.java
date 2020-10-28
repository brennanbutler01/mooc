package Tutorial12;

public class Tutorial12 {
	
	public static void main(String[] args) {
		
		int[] values = {3, 5, 6, 8, 1444, 234};
		
		System.out.println(values[2]);
		
		
		int[][] grid = {
				
				{3, 5, 6, 8, 1444, 234},
				{2, 3},
				{1, 2, 3}
	};
		System.out.println(grid[1][1]);
		
		String[][] texts = new String[2][3];
		texts[0][1] = "Hello There";
	
		System.out.println(texts[0][1]);
		
		
		for(int row = 0; row<grid.length; row++) {
			for (int col = 0; col<grid[row].length; col++) {
				System.out.println(grid[row][col] + "\t");
			}
			
			System.out.println();
		}
		
		String[][] words = new String[2][];
		
		System.out.println(words[0]);
	}
	
}