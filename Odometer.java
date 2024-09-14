package OOPPackage3;

public class Odometer {

    private int Miles;
    private int Rate;

    public void intialMiles ()
    {
        Miles = 0;
    } 
    public void setMiles (int mile)
    {
        Miles = Miles + mile ;
    }

    public void setRate (int rate)
    {
        Rate = rate;
    }
    
    public int getMiles ()
    {
        return Miles;
    }

    public int getRate ()
    {
        return Rate;
    }
  
    public float fuelefficiency()
    {
        return (Miles / Rate) ;
    }
}
