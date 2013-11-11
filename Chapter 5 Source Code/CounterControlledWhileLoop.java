//Counter-controlled while loop

import java.util.*;

public class CounterControlledWhileLoop
{
    static Scanner console = new Scanner(System.in);

    public static void main (String[] args)
    {
        int limit;      //store the number of items
                        //in the list
        int number;     //variable to store the number
        int sum;        //variable to store the sum
        int counter;    //loop control variable

        System.out.println("Line 1: Enter the data for "
                         + "processing.");               //Line 1

        limit = console.nextInt();                       //Line 2

        sum = 0;                                         //Line 3
        counter = 0;                                     //Line 4

        while (counter < limit)                          //Line 5
        {
            number = console.nextInt();                  //Line 6
            sum = sum + number;                          //Line 7
            counter++;                                   //Line 8
        }

        System.out.printf("Line 9: The sum of the %d " +
                        "numbers = %d%n", limit, sum);   //Line 9

        if (counter != 0)                                //Line 10
            System.out.printf("Line 11: The average = %d%n",
                              (sum / counter));          //Line 11
        else                                             //Line 12
            System.out.println("Line 13: No input.");    //Line 13
    }
}



