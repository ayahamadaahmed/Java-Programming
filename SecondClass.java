package OOPPackage2;

public class SecondClass {
    public static void main(String[] args) {
        Car x = new Car();

        x.setMake("Toyota");
        x.setYearModel(1980);
        System.out.println("Maker " + x.getMake());
        System.out.println("Year Model is " + x.getYearModel());

        Car y;
        y = new Car();

        y.setMake("Honda");
        y.setYearModel(2022);
        System.out.println("Maker " + y.getMake());
        System.out.println("Year Model is " + y.getYearModel());
    }
    
}
