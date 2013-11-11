//Example 7-7
//Program illustrating how a formal parameter of a
//primitive data type works.

public class PrimitiveTypeParameters
{
    public static void main(String[] args)
    {
        int number = 6;                                  //Line 1

        System.out.println("Line 2: Before calling the "
                         + "method funcPrimFormalParam, "
                         + "number = " + number);        //Line 2

        funcPrimFormalParam(number);                     //Line 3

        System.out.println("Line 4: After calling the "
                         + "method funcPrimFormalParam, "
                         + "number = " + number);        //Line 4
    }

    public static void funcPrimFormalParam(int num)
    {
        System.out.println("Line 5: In the method "
                         + "funcPrimFormalParam, before "
                         + "changing, num = " + num);    //Line 5

        num = 15;                                        //Line 6

        System.out.println("Line 7: In the method "
                         + "funcPrimFormalParam, after "
                         + "changing, num = " + num);    //Line 7
    }
}

