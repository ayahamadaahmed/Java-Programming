package OOPPackage1;

public class Rectangle {

    private double length;
    private double width;

    public void SetLength (double len)
    {
        if (len > 0)
        {
            length = len;
        }   
    }

    public void SetWidth (double wid)
    {
        if (wid > 0)
        {
            width = wid;
        }   
    }

    public double getLength ()
    {
        return length;
    }

    public double getWidth ()
    {
        return width;
    }
    public double Area ()
    {
        return length * width;
    }
}

