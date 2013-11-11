
public class CharClass
{
    private char ch;

    public CharClass()
    {
        ch = ' ';
    }

    public CharClass(char c)
    {
        ch = c;
    }

    public void setChar(char c)
    {
        ch = c;
    }

    public int getChar()
    {
        return ch;
    }

    public char nextChar()
    {
        return (char)((int)ch + 1);
    }

    public char prevChar()
    {
        return (char)((int)ch - 1);
    }

    public String toString()
    {
        return (String.valueOf(ch));
    }
}
