import java.util.*;

public class MethodLarger
{
  static Scanner console = new Scanner(System.in);

  public static void main(String[] args)
  {
      double one, two, maxNum;                     //Line 1

      System.out.println("Larger of 5 and 6 is "
                        + larger(5, 6));           //Line 2

      System.out.print("Enter two number: ");      //Line 3
      one = console.nextDouble();                  //Line 4
      two = console.nextDouble();                  //Line 5
      System.out.println();                        //Line 6

      System.out.println("Larger of " + one + " and "
                        + two + " is " +
                        larger(one, two));         //Line 7

      System.out.println("Larger of " + one
                       + " and 29 is "
                       + larger(one, 29));         //Line 8

      maxNum = larger(38.45, 56.78);               //Line 9
      System.out.println("maxNum = " + maxNum);    //Line 10
  }

  public static double larger(double x, double y)
  {
      if (x >= y)
          return x;
      else
          return y;
  }
}
