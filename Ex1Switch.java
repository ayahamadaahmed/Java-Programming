import java.util.Scanner;
public class Ex1Switch {
    public static void main(String[] args) {
        Scanner read = new Scanner (System . in);

        int day;
        System.out.println("PLZ Enter day number");
        day = read.nextInt();

        switch (day) {
            case 1: System.out.println("Saturday");
                break;

            case 2: System.out.println("Sunday");   
                break;

            case 3: System.out.println("Monday");
                break; 

            case 4: System.out.println("Tuesday");
                break;

            case 5: System.out.println("Wendsday");
                break;

            case 6: System.out.println("Thursrday");
                break;

            case 7: System.out.println("Friday");
                break;

            default:System.out.println("Invailled");
                break;
        }

        //Calculator

        int num1 , num2, choise;
        System.out.println("choise one of this operations to do");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        choise = read.nextInt();

        switch (choise) {

            case 1: System.out.println("Enter two numbers: ");
            num1 = read.nextInt();
            num2 = read.nextInt();
            System.out.println(num1 + num2);
                break;

            case 2: System.out.println("Enter two numbers: ");
            num1 = read.nextInt();
            num2 = read.nextInt();
            System.out.println(num1 - num2);
                break;

            case 3: System.out.println("Enter two numbers: ");
                num1 = read.nextInt();
                num2 = read.nextInt();
                System.out.println(num1 * num2);
                    break;

            case 4: System.out.println("Enter two numbers: ");
            num1 = read.nextInt();
            num2 = read.nextInt();
            System.out.println(num1 / num2);
                break;

            default:System.out.println("Invailled");
                break;
        }
        read.close();
    }
    
}
