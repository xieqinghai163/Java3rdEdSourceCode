//Counter-controlled while loop

import java.util.*;

public class CounterControlledWhileLoopVersionB
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
            sum = sum + console.nextInt(); ;             //Line 6
            counter++;                                   //Line 7
        }

        System.out.printf("Line 8: The sum of the %d " +
                        "numbers = %d%n", limit, sum);   //Line 8

        if (counter != 0)                                //Line 9
            System.out.printf("Line 10: The average = %d%n",
                              (sum / counter));          //Line 10
        else                                             //Line 11
           System.out.println("Line 12: No input.");     //Line 12
    }
}


