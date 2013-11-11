
//*************************************************************
// Author: D. S. Malik
//
// Program: Code Detection
// This program checks whether the message received at the
// destination is error-free. If there is an error in the
// message, then the program outputs an error message and
// asks for retransmission.
//**************************************************************

import java.io.*;
import java.util.*;

public class CodeDetection
{
	static final int MAX_CODE_SIZE = 250;

    public static void main (String[] args) throws
                                        FileNotFoundException
    {
        int[] codeArray = new int[MAX_CODE_SIZE]; //Step 1
		int	codeLength;                           //Step 1

                 //Step 2
        Scanner codeFile = new Scanner
                      (new FileReader("SecretCode.txt"));

        PrintWriter outFile =
                    new PrintWriter("SecretCodeOut.txt");

        codeLength = codeFile.nextInt();              //Step 3

	    if (codeLength <= MAX_CODE_SIZE)              //Step 4
	    {
		    readCode(codeFile, codeArray, codeLength);
		    compareCode(codeFile, outFile, codeArray,
		                codeLength);
	    }
	    else
		   System.out.println("Length of the secret code "
		                    + "must be <= " + MAX_CODE_SIZE);

	    codeFile.close();
	    outFile.close();
    }

    public static void readCode(Scanner inFile, int[] list,
                                int length)
    {
	    int count;

	    for (count = 0; count < length; count++)
		    list[count] = inFile.nextInt();
    }

    public static void compareCode(Scanner inFile,
                                   PrintWriter outP,
				                   int[] list, int length)
    {
		    //Step a: Declare the variables
	    int length2;
	    int digit;
	    boolean codeOk;
	    int count;

	    codeOk = true;                              //Step b

	    length2 = inFile.nextInt();                 //Step c

	    if (length != length2)                      //Step d
	    {
		    System.out.println("The original code and "
 			                 + "its copy are not of "
 			                 + "the same length.");
     	    return;
	    }

	    outP.println("Code Digit   Code Digit "
	              +  "Copy");                       //Step e

	    for (count = 0; count < length; count++)    //Step f
	    {
		    digit = inFile.nextInt();               //Step f.1

		    outP.printf("%5d %15d",
		                list[count], digit);        //Step f.2

		    if (digit != list[count])               //Step f.3
		    {
			    outP.println("  corresponding code "
			               + "digits not the same");
			    codeOk = false;
		    }
		    else
			    outP.println();
	    }

	    if (codeOk)                                 //Step g
		    outP.println("Message transmitted OK.");
	    else
		    outP.println("Error in transmission. "
		              + "Retransmit!!");
    }
}
