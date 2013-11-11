public class Banner2
{
    public static void main (String[] args)
    {
        printStars();						                    //Line 1
        System.out.println("********** Annual  ***********");	//Line 2
        printStars();						                    //Line 3
        System.out.println("******* Spring Sale **********");	//Line 4
        printStars();						                    //Line 5
    }

    public static void printStars()
    {
       int stars, lines;

       for (lines = 1; lines <= 2; lines++)                //Line 1
       {
           for (stars = 1; stars <= 30; stars++)           //Line 2
               System.out.print("*");					   //Line 3

           System.out.println();					       //Line 4
       }
    }
}