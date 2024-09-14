package OOPPackage4;

public class ForthClass {
    public static void main(String[] args) {
        
        CellPhone phone1 = new CellPhone();
        CellPhone phone2 = new CellPhone();

        phone1.setManufact("Samsung");
        phone1.setModel("SM-S92993");
        phone1.setPrice(23000);
        System.out.println(phone1.getManufact());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getPrice());

        phone2.setManufact("Apple");
        phone2.setModel("AP-A20283");
        phone2.setPrice(90000);
        System.out.println(phone2.getManufact());
        System.out.println(phone2.getModel());
        System.out.println(phone2.getPrice());

    }
    
}
