

public class SubClassSuperClassMethods
{
   public static void main(String[] args)
   {
      Rectangle myRectangle1 = new Rectangle();       //Line 1
      Rectangle myRectangle2 = new Rectangle(8, 6);   //Line 2

      Box myBox1 = new Box();                         //Line 3
      Box myBox2 = new Box(10, 7, 3);                 //Line 4

      System.out.println("Line 5: myRectangle1: "
                       + myRectangle1);               //Line 5

      System.out.println("Line 6: Area of myRectangle1: "
                        + myRectangle1.area());       //Line 6

      System.out.println("Line 7: myRectangle2: "
                       + myRectangle2);               //Line 7
      System.out.println("Line 8: Area of myRectangle2: "
                        + myRectangle2.area());       //Line 8

      System.out.println("Line 9: myBox1: "
                       + myBox1);                     //Line 9

      System.out.println("Line 10: Surface Area of myBox1: "
                        + myBox1.area());             //Line 10
      System.out.println("Line 11: Volume of myBox1: "
                        + myBox1.volume());           //Line 11

      System.out.println("Line 12: myBox2: "
                       + myBox2);                     //Line 12

      System.out.println("Line 13: Surface Area of myBox2: "
                        + myBox2.area());             //Line 13
      System.out.println("Line 14: Volume of myBox2: "
                        + myBox2.volume());           //Line 14
   }
}

