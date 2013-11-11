
public class BooleanClass
{
    private boolean flag;

    public BooleanClass()
    {
        flag = false;
    }

    public BooleanClass(boolean f)
    {
        flag = f;
    }

    public boolean get()
    {
        return flag;
    }

    public void set(boolean f)
    {
        flag = f;
    }

    public String toString()
    {
        return (String.valueOf(flag));
    }
}
