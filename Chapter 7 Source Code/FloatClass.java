
public class FloatClass
{
    private float x;

    public FloatClass()
    {
        x = 0;
    }

    public FloatClass(float num)
    {
        x = num;
    }

    public void setNum(float num)
    {
        x = num;
    }

    public float getNum()
    {
        return x;
    }

    public void addToNum(float num)
    {
        x = x + num;
    }

    public void multiplyToNum(float num)
    {
        x = x * num;
    }

    public float compareTo(float num)
    {
        return (x - num);
    }

    public boolean equals(float num)
    {
        if (x == num)
            return true;
        else
            return false;
    }

    public String toString()
    {
        return (String.valueOf(x));
    }
}
