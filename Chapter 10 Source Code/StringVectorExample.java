//StringVectorExample

import java.util.Vector;

public class StringVectorExample
{
   public static void main(String[] arg)
   {
      Vector<String> stringList = new Vector<String>();   //Line 1

      System.out.println("Line 2: Empty stringList?: "
                        + stringList.isEmpty());          //Line 2
      System.out.println("Line 3: Size stringList?: "
                        + stringList.size());             //Line 3
      System.out.println();                               //Line 4

      stringList.addElement("Spring");                    //Line 5
      stringList.addElement("Summer");                    //Line 6
      stringList.addElement("Fall");                      //Line 7
      stringList.addElement("Winter");                    //Line 8
      stringList.addElement("Sunny");                     //Line 9

      System.out.println("Line 10: **** After adding the "
                       + "elements to stringList ****");  //Line 10
      System.out.println("Line 11: Empty stringList?: "
                        + stringList.isEmpty());          //Line 11
      System.out.println("Line 12: Size stringList?: "
                        + stringList.size());             //Line 12
      System.out.println("Line 13: stringList: "
                        + stringList);                    //Line 13

      System.out.println("Line 14: stringList contains Fall?: "
                        + stringList.contains("Fall"));   //Line 14
      System.out.println();                               //Line 15

      stringList.insertElementAt("Cool", 1);              //Line 16
      System.out.println("Line 17: **** After adding an "
                       + "element at position 1 ****");   //Line 17
      System.out.println("Line 18: stringList: "
                        + stringList);                    //Line 18

      System.out.println();                               //Line 19

      stringList.removeElement("Fall");                   //Line 20
      stringList.removeElementAt(2);                      //Line 21
      System.out.println("Line 22: **** After the remove "
                       + "operations ****");              //Line 22
      System.out.println("Line 23: stringList: "
                        + stringList);                    //Line 23
      System.out.println("Line 24: Size stringList?: "
                        + stringList.size());             //Line 24
      System.out.println("Line 25: indexOf(\"Sunny\"): "
                        + stringList.indexOf("Sunny"));   //Line 25
   }
}
