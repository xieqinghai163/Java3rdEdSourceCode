//Program to illustrate the effect of various String methods

public class VariousStringMethods
{
   public static void main(String[] args)
   {
      String sentence;
      String str1;
      String str2;
      String str3;
      int index;

      sentence =
         "Now is the time for the birthday party";   //Line 1

      System.out.println("Line 2: sentence = \""
                        + sentence + "\"");          //Line 2
      System.out.println("Line 3: The length of "
                       + "sentence = "
                       + sentence.length());         //Line 3

      System.out.println("Line 4: The character at "
                       + "index 16 in "
                       + "sentence = "
                       + sentence.charAt(16));       //Line 4

      System.out.println("Line 5: The index of first "
                       + "t in "
                       + "sentence = "
                       + sentence.indexOf('t'));     //Line 5

      System.out.println("Line 6: The index of for "
                       + "in sentence "
                       + "= "
                       + sentence.indexOf("for"));   //Line 6

      System.out.println("Line 7: sentence in "
                       + "uppercase = \n"
                       + "        \""
                       + sentence.toUpperCase()
                       + "\"");                      //Line 7

      index = sentence.indexOf("birthday");          //Line 8

      str1 = sentence.substring(index, index + 14);  //Line 9

      System.out.println("Line 10: str1 = \""
                       + str1 + "\"");               //Line 10

      str2 = "Super " + str1;                        //Line 11
      System.out.println("Line 12: str2 = \""
                       + str2 + "\"");               //Line 12

      str3 = sentence.replace('t', 'T');             //Line 13
      System.out.println("Line 14: str3 = \""
                       + str3 + "\"");               //Line 14
   }
}
