//Two dimensional arrays as parameters.

public class TwoDimArraysAsParam
{
    public static void main(String[] args)
    {
        int[][] board ={{23,5,6,15,18},
                        {4,16,24,67,10},
                        {12,54,23,76,11},
                        {1,12,34,22,8},
                        {81,54,32,67,33},
                        {12,34,76,78,9}};               //Line 1

        printMatrix(board);                             //Line 2
        System.out.println();                           //Line 3
        sumRows(board);                                 //Line 4
        System.out.println();                           //Line 5
        largestInRows(board);                           //Line 6
    }

    public static void printMatrix(int[][] matrix)
	{
	    int row, col;

	    for (row = 0; row < matrix.length; row++)
	    {
	        for (col = 0; col < matrix[row].length; col++)
	            System.out.printf("%7d", matrix[row][col]);

	        System.out.println();
	    }
	}

    public static void sumRows(int[][] matrix)
	{
	    int row, col;
	    int sum;

	        //sum of each individual row
	    for (row = 0; row < matrix.length; row++)
	    {
	        sum = 0;

	        for (col = 0; col < matrix[row].length; col++)
	             sum = sum + matrix[row][col];

	        System.out.println("The sum of the elements of row "
	                         + (row + 1) + " = " + sum);
	    }
	}

    public static void largestInRows(int[][] matrix)
	{
	    int row, col;
	    int largest;

	        //Largest element in each row
	    for (row = 0; row < matrix.length; row++)
	    {
	        largest = matrix[row][0]; //assume that the first
	                                  //element of the row is
	                                  //largest
	        for (col = 1; col < matrix[row].length; col++)
	            if (largest < matrix[row][col])
	                largest = matrix[row][col];

	        System.out.println("The largest element of row "
	                         + (row + 1) + " = " + largest);
	    }
	}
}
