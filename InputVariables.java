import java.util.Scanner;
public class InputVariables{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        /* 
        int length , width , area;

        System.out.println("Plz Enter Rectangle length");
        length = input.nextInt();

        System.out.println("Plz Enter Rectangle width");
        width = input.nextInt();

        area = length * width;

        System.out.printf("Area of Rectangle is %d", area ); // %d to print number
        */

        String name ;
        float Salary  , tax = 0;

        System.out.println("\n PLZ Enter your name");
        name = input.next();

        System.out.println("PLZ Enter your Salary");
        Salary = input.nextFloat();

        tax = Salary -  (Salary * 0.10f);
        System.out.println(name);
        System.out.printf("your Salary after tax is %f", tax);
        
        input.close(); //close the  Scanner
    }
}
