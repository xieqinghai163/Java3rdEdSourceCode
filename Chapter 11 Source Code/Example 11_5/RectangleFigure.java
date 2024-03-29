
public class RectangleFigure
{
    private double length;
    private double width;

    public RectangleFigure ()
    {
       length = 0;
       width = 0;
    }

    public RectangleFigure (double l, double w)
    {
       setDimension(l, w);
    }

    public void setDimension(double l, double w)
    {
        if (l >= 0)
            length = l;
        else
            length = 0;

        if (w >= 0)
            width = w;
        else
            width = 0;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public double area()
    {
        return length * width;
    }

    public double perimeter()
    {
        return 2 * (length + width);
    }

    public void print()
    {
        System.out.print("Length = "  + length
                         + "; Width = " + width
                         + "\n"
                         + "Area = " + area());
    }
}
