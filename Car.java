package OOPPackage2;

public class Car {
    private String make;
    private int YearModel;

    public void setMake(String Maker)
    {
        if (Maker == "Toyota" || Maker == "Honda" || Maker == "Marcedes")
        {
            make = Maker;
        }
        else
        {
            System.out.println("Invallied Maker");
        }    
    }

    public void setYearModel(int year)
    {
        if (year > 2010)
        {
            YearModel = year;
        }
        else
        {
            System.out.println("Invallied Model");
        }
    }

    public String getMake()
    {
        return make;
    }

    public int getYearModel()
    {
        return YearModel; 
    }

}
