

public class Polymorphism
{
   public static void main(String[] args)
   {
      RectangleFigure rec, shapeRef;               //Line 1

      BoxFigure box;                               //Line 2

      rec = new RectangleFigure(8, 5);             //Line 3
      box = new BoxFigure(10, 7, 3);               //Line 4


      shapeRef = rec;                              //Line 5
      System.out.println("Line 6: Rectangle:");    //Line 6
      shapeRef.print();                            //Line 7
      System.out.println();                        //Line 8
      System.out.println();                        //Line 9

      shapeRef = box;                              //Line 10
      System.out.println("Line 11: Box:");         //Line 11
      shapeRef.print();                            //Line 12
      System.out.println();                        //Line 13
   }
}

