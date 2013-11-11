
public class Example2_20
{
    public static void main(String[] args)
    {
        String str;

        int num1;
        int num2;

        num1 = 12;                                       //Line 1
        num2 = 26;                                       //Line 2

        str = "The sum = " + num1 + num2;                //Line 3
        System.out.println("Line 4: str: " + str);       //Line 4

        str = "The sum = " + (num1 + num2);              //Line 5
        System.out.println("Line 6: str: " + str);       //Line 6

        str = num1 + num2 + " is the sum";               //Line 7
        System.out.println("Line 8: str: " + str);       //Line 8

        str = "The sum of " + num1 + " and " + num2 + " = "
              + (num1 + num2);                           //Line 9
        System.out.println("Line 10: str: " + str);      //Line 10
    }
}

