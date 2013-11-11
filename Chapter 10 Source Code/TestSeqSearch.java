import java.util.*;

public class TestSeqSearch
{
    static Scanner console = new Scanner(System.in);
    static final int ARRAY_SIZE = 10;

    public static void main(String[] args)
    {
        int[] intList = new int[ARRAY_SIZE];           //Line 1
        int number;                                    //Line 2
        int index;                                     //Line 3

        System.out.println("Line 4: Enter " + ARRAY_SIZE
                         + " integers.");              //Line 4

        for (index  = 0; index < ARRAY_SIZE; index++)  //Line 5
            intList[index] = console.nextInt();        //Line 6

        System.out.println();                          //Line 7

        System.out.print("Line 8: Enter the number "
                       + "to be searched: ");          //Line 8
        number  = console.nextInt();                   //Line 9
        System.out.println();                          //Line 10

        index = seqSearch(intList, ARRAY_SIZE, number);//Line 11

        if (index != -1)                               //Line 12
            System.out.println("Line 13: " + number
                             + " is found at position "
                             + index);                 //Line 13
        else                                           //Line 14
            System.out.println("Line 15: " + number
                           + " is not in the list.");  //Line 15

    }

    public static int seqSearch(int[] list, int listLength,
                                int searchItem)
    {
        int loc;
        boolean found = false;

        for (loc = 0; loc < listLength; loc++)
            if (list[loc] == searchItem)
            {
                found = true;
                break;
            }

        if (found)
            return loc;
        else
            return -1;
    }
}
