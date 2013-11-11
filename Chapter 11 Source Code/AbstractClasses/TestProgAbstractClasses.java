

public class TestProgAbstractClasses
{
	public static void main(String[] arg)
	{
		IntClass num1 = new IntClass(10);
		IntClass num2 = new IntClass(15);

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		if (num1.compareTo(num2) > 0)
		    System.out.println(num1 + " is greater than " + num2);
		else
		    if (num1.compareTo(num2) < 0)
		        System.out.println(num1 + " is less than " + num2);
		    else
		        System.out.println(num1 + " is equal to " + num2);

	}
}