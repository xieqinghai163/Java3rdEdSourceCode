

public class SubClassSuperClassMethods
{
   public static void main(String[] args)
   {
      Rectangle myRectangle1 = new Rectangle();       //Line 1
      Rectangle myRectangle2 = new Rectangle(8, 6);   //Line 2

      Box myBox1 = new Box();                         //Line 3
      Box myBox2 = new Box(10, 7, 3);                 //Line 4

      System.out.print("Line 5: myRectangle1: ");     //Line 5
      myRectangle1.print();                           //Line 6
      System.out.println();                           //Line 7
      System.out.println("Line 8: Area of myRectangle1: "
                        + myRectangle1.area());       //Line 8
      System.out.print("Line 9: myRectangle2: ");     //Line 9
      myRectangle2.print();                           //Line 10
      System.out.println();                           //Line 11
      System.out.println("Line 12: Area of myRectangle2: "
                        + myRectangle2.area());       //Line 12

      System.out.print("Line 13: myBox1: ");          //Line 13
      myBox1.print();                                 //Line 14
      System.out.println();                           //Line 15
      System.out.println("Line 16: Surface Area of myBox1: "
                        + myBox1.area());             //Line 16
      System.out.println("Line 17: Volume of myBox1: "
                        + myBox1.volume());           //Line 17

      System.out.print("Line 18: myBox2: ");          //Line 18
      myBox2.print();                                 //Line 19
      System.out.println();                           //Line 20
      System.out.println("Line 21: Surface Area of myBox2: "
                        + myBox2.area());             //Line 21
      System.out.println("Line 22: Volume of myBox2: "
                        + myBox2.volume());           //Line 22
   }
}


