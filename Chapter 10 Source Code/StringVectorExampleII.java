//StringVectorExample

import java.util.Vector;

public class StringVectorExampleII
{
    public static void main(String[] arg)
    {
        Vector<String> stringList =
                            new Vector<String>();         //Line 1

        stringList.addElement("One");                     //Line 2
        stringList.addElement("Two");                     //Line 3
        stringList.addElement("Three");                   //Line 4
        stringList.addElement("Four");                    //Line 5
        stringList.addElement("Five");                    //Line 6
        stringList.addElement("Six");                     //Line 5
        stringList.addElement("Seven");                   //Line 6

        System.out.println("stringList: " + stringList);  //Line 7

        for (String str : stringList)                     //Line 8
            System.out.println(str.toUpperCase());        //Line 9
     }
}
