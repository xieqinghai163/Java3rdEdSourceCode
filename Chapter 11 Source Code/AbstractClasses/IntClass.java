
public class IntClass extends PrimitiveTypeClass
{
    private int x;

    public IntClass()
    {
        x = 0;
    }

    public IntClass(int num)
    {
        x = num;
    }

    public void setNum(int num)
    {
        x = num;
    }

    public int getNum()
    {
        return x;
    }

    public void addToNum(int num)
    {
        x = x + num;
    }

    public void multiplyToNum(int num)
    {
        x = x * num;
    }

    public int compareTo(PrimitiveTypeClass right)
    {
        IntClass temp = (IntClass) right;

        return (x - temp.getNum());
    }

    public boolean equals(PrimitiveTypeClass right)
    {
        IntClass temp = (IntClass) right;

        if (x == temp.getNum())
            return true;
        else
            return false;
    }

    public String toString()
    {
        return (String.valueOf(x));
    }
}
