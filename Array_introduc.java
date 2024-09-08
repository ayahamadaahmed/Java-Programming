import java.util.Scanner;
public class Array_introduc {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int size = 0;
        System.out.println("Enter size of array is: ");
        size = input.nextInt();

        double[] salary = new double[size];
        for (int i = 0; i < salary.length; i++)
        {
            System.out.println("Enter salary of employee No " + (i+1));
            salary[i] = input.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < salary.length; i++)
        {
           sum += salary[i];
        }
        System.out.println("Sum of salaries is " + sum);
        System.out.println("Average of salaries is " + (sum /salary.length ));
        input.close();
    }
    
}
