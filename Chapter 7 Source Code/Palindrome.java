
//*************************************************************
// Author D.S. Malik
//
// Program: Palindrome
// This program determines whether an integer is a palindrome.
//*************************************************************

import javax.swing.JOptionPane;

public class Palindrome
{
    public static void main(String[] args)
    {
        long num;
        long temp;

        String inputStr;
        String outputStr;

        inputStr =
            JOptionPane.showInputDialog("Enter an integer, "
                                      + "positive or negative");

        num = Long.parseLong(inputStr);
        temp = num;

        if (num <= 0)
        {
            num = -num;
            inputStr = inputStr.valueOf(num);
        }

        if (isPalindrome(inputStr))
            outputStr = temp + " is a palindrome";
        else
            outputStr = temp + " is not a palindrome";

        JOptionPane.showMessageDialog(null, outputStr,
                            "Palindrome Program",
                            JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public static boolean isPalindrome(String str)
    {
        int len = str.length();                       //Step 1
        int i, j;

        j = len - 1;                                  //Step 2

        for (i = 0; i <= (len - 1)/2; i++)            //Step 3
        {
            if (str.charAt(i) !=  str.charAt(j))      //Step 3.a
               return false;
            j--;                                      //Step 3.b
        }

        return true;                                  //Step 4
    }
}
