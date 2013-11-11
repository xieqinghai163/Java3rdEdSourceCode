
public class LongClass
{
    private long x;

    public LongClass()
    {
        x = 0;
    }
    public LongClass(long num)
    {
        x = num;
    }

    public void setNum(long num)
    {
        x = num;
    }

    public long getNum()
    {
        return x;
    }

    public void addToNum(long num)
    {
        x = x + num;
    }

    public void multiplyToNum(long num)
    {
        x = x * num;
    }

    public long compareTo(long num)
    {
        return (x - num);
    }

    public boolean equals(long num)
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
