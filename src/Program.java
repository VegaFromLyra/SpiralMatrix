
public class Program {

	public static void main(String[] args) {
		
		int[][] input = {
				           {1,   2,   3,   4},
				           {12,  13,  14,  5},
				           {11,  16,  15,  6},
				           {10,  9,   8,   7}
	                   	};
		
		
		PrintSpiral(input);

	}
	
	public static void PrintSpiral(int[][] input)
	{
		int rowStart = 0;
		int columnStart = 0;
		
		int rowSize = input.length;
		int columnSize = input[0].length;
		
				
		while ((rowStart < rowSize) && (columnStart < columnSize))
		{
			// Print top row
			for(int j = columnStart; j < columnSize; j++)
			{
				System.out.print(input[rowStart][j] + " ");
			}
			
			// print rightmost column
			for(int i = rowStart + 1; i < rowSize; i++)
			{
				System.out.print(input[i][columnSize - 1] + " ");
			}
			
			// print bottom row
			for(int j = columnSize - 2; j >= columnStart; j--)
			{
				System.out.print(input[rowSize - 1][j] + " ");
			}
			
			// print left most row
			for(int i = rowSize - 2; i > rowStart ; i--)
			{
				System.out.print(input[i][columnStart] + " ");
			}
			
			rowStart++;
			columnStart++;
			rowSize--;
			columnSize--;
		}
	}
}

