package OOPPackage1;

public class firstClass {
    public static void main(String[] args) {
        Rectangle x = new Rectangle(); 
        x.SetLength(10);
        x.SetWidth(5);
        System.out.println("Length of Rectangle is " + x.getLength());
        System.out.println( "Width of Rectangle is " + x.getWidth());   
        System.out.println("Area of Rectangle is " + x.Area());
    }
    
}
