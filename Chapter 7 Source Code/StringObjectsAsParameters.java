//Program: String Objects as Parameters

public class StringObjectsAsParameters
{
    public static void main(String[] args)
    {
        String str = "Hello";                         //Line 1

        System.out.println("Line 2: str before "
                         + "calling the method "
                         + "stringParameter: "+ str); //Line 2

        stringParameter(str);                         //Line 3

        System.out.println("Line 4: str after "
                         + "calling the method "
                         + "stringParameter: "+ str); //Line 4
    }

    public static void stringParameter(String pStr)
    {
        System.out.println("Line 5: In the method "
                         + "stringParameter");        //Line 5
        System.out.println("Line 6: pStr before "
                         + "changing its value: "
                         + pStr);                     //Line 6

        pStr = "Sunny Day";                           //Line 7
        System.out.println("Line 8: pStr after "
                         + "changing its value: "
                         + pStr);                     //Line 8
    }
}
