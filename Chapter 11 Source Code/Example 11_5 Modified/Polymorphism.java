

public class Polymorphism
{
    public static void main(String[] args)
    {
        RectangleFigure rec, shapeRef;               //Line 1

        BoxFigure box;                               //Line 2

        rec = new RectangleFigure(8, 5);             //Line 3
        box = new BoxFigure(10, 7, 3);               //Line 4


        shapeRef = rec;                              //Line 5
        System.out.println("Line 6: Rectangle:\n"
                         + shapeRef);                //Line 6
        System.out.println();                        //Line 7

        shapeRef = box;                              //Line 8
        System.out.println("Line 9: Box:\n"
                          + shapeRef);               //Line 9
        System.out.println();                        //Line 10
    }
}

