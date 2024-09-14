package OOPPackage4;

public class CellPhone {
    private String Manufact;
    private String Model;
    private double RetailPrice;

    public void setManufact (String man)
    {
        Manufact = man;
    }

    public void setModel (String mod)
    {
        Model = mod;
    }
    
    public void setPrice (double price) 
    {
        RetailPrice = price;
    }

    public String getManufact ()
    {
        return Manufact;
    }

    public String getModel ()
    {
        return Model;
    }
    
    public double getPrice () 
    {
        return RetailPrice;
    }

}
