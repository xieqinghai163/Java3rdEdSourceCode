
//This program contains all the two-dimensional
//array processing methods given in the text.

public class TwoDimMethods
{
    static final int ROWS = 5;       //this can be set to any number
    static final int COLUMNS = 5;    //this can be set to any number

    public static void main(String[] args)
    {
        int[][] board ={{23,5,6,15,18},
                        {4,16,24,67,10},
                        {12,54,23,76,11},
                        {1,12,34,22,8},
                        {81,54,32,67,33}};

        printMatrix(board);
        sumRows(board);
        largestInRows(board);
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

    public static void sumColumns(int[][] matrix)
    {
        int row, col;
        int sum;

              //sum of each individual column
        for (col = 0; col < matrix[0].length; col++)
        {
            sum = 0;
            for (row = 0; row < matrix.length; row++)
                sum = sum + matrix[row][col];
            System.out.println("The sum of the elements of column "
                             + (col + 1) + " = " + sum);
        }
    }

    public static void largestInRows(int[][] matrix)
	{
	    int row, col;
	    int largest;

	        //The largest element in each row
	    for (row = 0; row < matrix.length; row++)
	    {
	        largest = matrix[row][0]; //assume that the first
	                                  //element of the row is
	                                  //the largest
	        for (col = 1; col < matrix[row].length; col++)
	            if (largest < matrix[row][col])
	                largest = matrix[row][col];

	        System.out.println("The largest element of row "
	                         + (row + 1) + " = " + largest);
	    }
	}

    public static void largestinColumns(int[][] matrix)
    {
        int row, col;
        int largest;

                  //Largest element in each column
        for (col = 0; col < matrix[0].length; col++)
        {
            largest = matrix[0][col];  //assume the the first
                                       //element of the column
                                       //is the largest
            for (row = 1; row < matrix.length; row++)
                if (largest < matrix[row][col])
                    largest = matrix[row][col];
            System.out.println("The largest element of col "
                             + (col + 1) + " = " + largest);
        }
    }

    public static void reverseDiagonal(int[][] matrix)
    {
        int row;
        int temp;

                //Reverse main diagonal
        for (row = 0; row < matrix.length / 2; row++)
        {
            temp = matrix[row][row];
            matrix[row][row] =
                  matrix[matrix.length-1-row][matrix.length-1-row];
            matrix[matrix.length-1-row][matrix.length-1-row]
                   = temp;
        }

                //Reverse the opposite diagonal
        for (row = 0; row < matrix.length / 2; row++)
        {
            temp = matrix[row][matrix.length-1-row];
            matrix[row][matrix.length-1-row] =
                   matrix[matrix.length-1-row][row];
            matrix[matrix.length-1-row][row] = temp;
        }
    }
}