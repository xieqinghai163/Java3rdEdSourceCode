
public class Banner
{
    public static void main(String[] args)
    {
        printStars();                                  //Line 1
        System.out.println("********** Annual  *****"
                          + "******");                 //Line 2

        printStars();                                  //Line 3
        System.out.println("******* Spring Sale ****"
                         + "******");                  //Line 4

        printStars();                                  //Line 5
    }

    public static void printStars()
    {
        System.out.println("******************************");
        System.out.println("******************************");
    }
}
