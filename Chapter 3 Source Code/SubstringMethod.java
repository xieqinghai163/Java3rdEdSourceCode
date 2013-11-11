//The substring method

public class SubstringMethod
{
    public static void main (String[] args)
    {
        String 	sentence;
        String	str1;
        String  str2;

        sentence = "It is cloudy and warm.";                   //Line 1

        System.out.println("Line 2: "
                          + sentence.substring(0, 5));         //Line 2
        System.out.println("Line 3: "
                          + sentence.substring(6, 12));        //Line 3
        System.out.println("Line 4: "
                          + sentence.substring(6, 22));        //Line 4
        System.out.println("Line 5: "
                          + sentence.substring(3, 9));         //Line 5

        str1 = sentence.substring(0, 8);                       //Line 6
        System.out.println("Line 7: str1 = \"" + str1 + "\""); //Line 7

        str2 = sentence.substring(2, 12);                      //Line 8
        System.out.println("Line 9: str2 = \"" + str2 + "\""); //Line 9
    }
}
