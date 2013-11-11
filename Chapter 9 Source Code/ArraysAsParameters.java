//Arrays as parameters to methods

import java.util.*;

public class ArraysAsParameters
{
    static final int ARRAY_SIZE = 10;
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] listA = new int[ARRAY_SIZE];               //Line 1
        int[] listB = new int[ARRAY_SIZE];               //Line 2

        System.out.print("Line 3: listA elements: ");    //Line 3

            //output the elements of listA using
            //the method printArray
        printArray(listA, listA.length);                 //Line 4
        System.out.println();                            //Line 5

        System.out.print("Line 6: Enter " + listA.length
                       + " integers: ");                 //Line 6

            //input data into listA using the method fillArray
        fillArray(listA, listA.length);                  //Line 7
        System.out.println();                            //Line 8

        System.out.print("Line 9: After filling "
                       + "listA, the elements are:"
                       + "\n        ");                  //Line 9

            //output the elements of listA
        printArray(listA, listA.length);                 //Line 10
        System.out.println();                            //Line 11

            //find and output the sum of the elements of listA
        System.out.println("Line 12: The sum of the "
                    + "elements of listA is: "
                    + sumArray(listA, listA.length));    //Line 12

            //find and output the position of the (first)
            //largest element in listA
        System.out.println("Line 13: The position of "
                 + "the largest element in "
                 + "listA is: "
                 + indexLargestElement(listA,
                                       listA.length));   //Line 13

             //find and output the largest element in listA
        System.out.println("Line 14: The largest element "
            + "in listA is: "
            + listA[indexLargestElement(listA,
                                        listA.length)]); //Line 14

             //copy the elements of listA into listB
             //using the method copyArray
        copyArray(listA, listB, listA.length);           //Line 15
        System.out.print("Line 16: After copying the "
                   + "elements of listA into listB\n"
                   + "         listB elements are: ");   //Line 16

             //output the elements of listB
        printArray(listB, listB.length);                 //Line 17
        System.out.println();                            //Line 18
    }

        //Method to input data and store in an int array.
        //The array to store the data and its size are passed as
        //parameters. The parameter numOfElements specifies the
        //number of elements to be read.
    public static void fillArray(int[] list, int numOfElements)
    {
        int index;

        for (index = 0; index < numOfElements; index++)
            list[index] = console.nextInt();
    }

        //Method to print the elements of an int array.
        //The array to be printed and the number of elements are
        //passed as parameters. The parameter numOfElements
        //specifies the number of elements to be printed.
        public static void printArray(int[] list, int numOfElements)
    {
        int index;

        for (index = 0; index < numOfElements; index++)
            System.out.print(list[index] + " ");
    }

        //Method to find and return the sum of the elements of an
        //int array. The parameter numOfElements specifies the
        //number of elements to be added.
    public static int sumArray(int[] list, int numOfElements)
    {
        int index;
        int sum = 0;

        for (index = 0; index < numOfElements; index++)
             sum = sum + list[index];

        return sum;
    }

        //Method to find and return the index of the first largest
        //element in an int array. The parameter numOfElements
        //specifies the number of elements in the array.
    public static int indexLargestElement(int[] list,
                                          int numOfElements)
    {
        int index;
        int maxIndex = 0; //Assume first element is the largest

        for (index = 1; index < numOfElements; index++)
             if (list[maxIndex] < list[index])
                 maxIndex = index;

         return maxIndex;
    }

        //Method to copy one array into another array. The elements
        //of list1 are copied into list2. The array list2 must be
        //at least as large as the number of elements to be copied.
        //The parameter numOfElements specifies the number of
        //elements of list1 to be copied into list2.
    public static void copyArray(int[] list1, int[] list2,
                                 int numOfElements)
    {
        int index;

        for (index = 0; index < numOfElements; index++)
             list2[index] = list1[index];
    }
}
