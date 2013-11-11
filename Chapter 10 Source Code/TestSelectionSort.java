public class TestSelectionSort
{
    public static void main(String[] args)
    {
        int list[] = {2, 56, 34, 25, 73, 46, 89,
                      10, 5, 16};                   //Line 1
        int i;                                      //Line 2

        selectionSort(list, 10);                    //Line 3

        System.out.println("After sorting, the "
                         + "list elements are:");   //Line 4

        for (i = 0; i < 10; i++)                    //Line 5
            System.out.print(list[i] + " ");        //Line 6

        System.out.println();                       //Line 7
    }

    public static void selectionSort(int[] list, int listLength)
    {
        int index;
        int smallestIndex;
        int minIndex;
        int temp;

        for (index = 0; index < listLength - 1; index++)
        {
                //Step a
            smallestIndex = index;

            for (minIndex = index + 1; minIndex < listLength;
                                       minIndex++)
                if (list[minIndex] < list[smallestIndex])
                    smallestIndex = minIndex;

                //Step b
            temp = list[smallestIndex];
            list[smallestIndex] = list[index];
            list[index] = temp;
        }
    }
}
