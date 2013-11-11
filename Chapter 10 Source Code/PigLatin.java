//***********************************************************
// Author: D.S. Malik
//
// Program: PigLatin String
// This program takes as input a string and outputs the
// string in the pig latin form.
//***********************************************************

import java.util.*;

public class PigLatin
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        String str;

        System.out.print("Enter a string: ");
        str = console.next();
        System.out.println();

        System.out.println("The pig Latin form of " + str
                       + " is: " + pigLatinString(str));
    }

    public static boolean isVowel(char ch)
    {
        switch(ch)
        {
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
        case 'Y':
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'y':
            return true;

        default:
            return false;
        }
    }

    public static String rotate(String pStr)
    {
        int len = pStr.length();

        String rStr;

        rStr = pStr.substring(1,len) + pStr.charAt(0);

        return rStr;
    }

    public static String pigLatinString(String pStr)
    {
        int len;

        boolean foundVowel;

        int counter;

        if (isVowel(pStr.charAt(0)))                 //Step 1
             pStr = pStr + "-way";
        else                                         //Step 2
        {
            pStr = pStr + "-";
            pStr = rotate(pStr);                     //Step 3

            len = pStr.length();                     //Step 3.a
            foundVowel = false;                      //Step 3.b

            for (counter = 1; counter < len - 1;
                              counter++)             //Step 3.d
                if (isVowel(pStr.charAt(0)))
                {
                    foundVowel = true;
                    break;
                }
                else                                 //Step 3.c
                    pStr = rotate(pStr);

            if (!foundVowel)                         //Step 4
                pStr = pStr.substring(1,len) + "-way";
            else
                pStr = pStr + "ay";
        }

        return pStr;                                 //Step 5
    }
}