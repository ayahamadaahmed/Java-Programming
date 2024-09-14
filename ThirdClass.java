package OOPPackage3;

public class ThirdClass {
public static void main(String[] args) {
    int m = 300; 
    Odometer x = new Odometer();

    x.setMiles(m);
    x.setMiles(900);
    x.setRate(60);
    System.out.println("Miles = " + x.getMiles());
    System.out.println("Rate = " + x.getRate());
    System.out.println("Fuel Efficiency = " + x.fuelefficiency() + " Miles / gallons");
}
}
