import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        /*int grade , count = 1;
        double sum = 0;
        do
        {
            System.out.println("Enter student grades of " + count);
            grade = read .nextInt();
            sum += grade;
            count ++ ;

        }while(count <= 6);
        System.out.println("Average is " + sum / 6);*/

        //Do menu

        int option;
        do
        {

        int num1 , num2; 
        System.out.println("1. Addition two numbers");
        System.out.println("2. Substraction two numbers");
        System.out.println("3. Division two numbers");
        System.out.println("0. Exite");
        option = read.nextInt();
            switch (option) {

                case 1:
                    System.out.println("Enter two number");
                    num1 = read.nextInt();
                    num2 = read .nextInt();
                    System.out.println("Addition of two number = " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Enter two number");
                    num1 = read.nextInt();
                    num2 = read .nextInt();
                    System.out.println("Substraction of two number = " + (num1 - num2) );
                    break;

                case 3:
                    System.out.println("Enter two number");
                    num1 = read.nextInt();
                    num2 = read .nextInt();
                    System.out.println("Division of two number = " + (num1 / num2));
                    break;

                case 0:
                System.out.println("Good Bye");
                break;
                
                default :
                System.out.println("Invallied number");
                    break;
            }

        } while (option != 0);
        read.close();
    }
    
}
