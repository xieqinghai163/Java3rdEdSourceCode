
public class Example2_9B
{
    public static void main(String[] args)
    {
        int x = 15;
        int y = 23;
        double z = 3.75;

        System.out.println("(int)(7.9 + 6.7) = " + (int)(7.9 + 6.7));
        System.out.println("(int)(7.9) + (int)(6.7)  = "
                         + ((int)(7.9) + (int)(6.7)));
        System.out.println("(double)(y / x) + z = " + ((double)(y / x) + z));
        System.out.println("(double)(y) / x + z = "
                          + ((double)(y) / x + z));
    }
}

