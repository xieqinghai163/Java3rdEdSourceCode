//StaticMembers

public class StaticMembers
{
   public static void main(String[] args)
   {
   	  Illustrate illusObject = new Illustrate();

      System.out.println(illusObject);
      illusObject.incrementY();

      Illustrate.count++;
      System.out.println(illusObject);

      System.out.println(Illustrate.count);
   }
}
